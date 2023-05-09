
const fs = require("fs-extra");
const pathlib = require("path");
const util = require("util");
const child_process = require("child_process");

const caseDir = pathlib.join(__dirname, "..", "cases");
const programFile = pathlib.join(__dirname, "..", "build", "regex.exe");
const resultFile = pathlib.join(__dirname, "result.json");

/**
 * 调用程序对给定的正则表达式和输入串进行匹配。
 * @param {string} pattern 正则表达式
 * @param {string} input 输入串
 * @returns {Promise<string[]>} 匹配结果
 */
function run(pattern, input) {
  return new Promise((resolve, reject) => {
    const content = [
      "type: find",
      "pattern: " + pattern,
      "input: " + input
    ].join('\n');

    const proc = child_process.execFile(programFile, [], {
      timeout: 2000
    }, (err, stdout, stderr) => {
      if (err) {
        return reject(Object.assign(err, { stdout, stderr }));
      }

      const line = stdout.split('\n').map(x => x.trim()).filter(x => x.length > 0).pop();
      try {
        const results = JSON.parse(line);
        if (!Array.isArray(results) || results.some(x => typeof x !== "string"))
          throw new Error("result is not array of strings");
        resolve(results);
      } catch (err) {
        reject(Object.assign(err, { text: line }));
      }
    });

    proc.stdin.end(content);
  });
}

async function main() {
  const caseFiles = fs.readdirSync(caseDir);
  const errorCases = [];

  for (const caseFile of caseFiles) {
    if (!caseFile.endsWith(".json")) continue;

    console.log("[file]", caseFile);

    const casePath = pathlib.join(caseDir, caseFile);
    const cases = fs.readJsonSync(casePath);

    for (let { pattern, inputs } of cases) {
      const regex = new RegExp(pattern);

      for (const input of inputs) {
        try {
          const output = await run(pattern, input);
          const answer = Array.from(regex.exec(input) || []);
          // answer.splice(1);
          if (!util.isDeepStrictEqual(output, answer))
            throw new Error(`output mismatch: ${JSON.stringify(output)} != ${JSON.stringify(answer)}`);
          // console.log("[case] ok:", pattern, input);
        } catch (err) {
          console.log("[case] error:", pattern, input);
          console.error(err.message);
          errorCases.push({ pattern, input, err })
          break;
        }
      }
    }
  }

  fs.writeJsonSync(resultFile, errorCases, { spaces: 2 });
  console.log("[report]", resultFile);
}

main();
