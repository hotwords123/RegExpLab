#include "regex-matcher.h"
#include <cctype>

bool RegexMatcher::match(int start_pos) {
    Path path = executor.exec(start_pos);
    if (path.states.empty()) return false;

    group_pos.assign(regex.group_count + 1, {0, 0});
    in_group.assign(regex.group_count + 1, false);

    int step = 0;
    int pos = start_pos;
    for (; path.states[step + 1] == 0; step++) {
        pos += path.consumes[step].length();
    }

    // 记录匹配开始的位置
    group_pos[0].first = pos;

    // 计算捕获组的匹配位置
    for (; step < (int)path.consumes.size(); step++) {
        int state = path.states[step + 1]; // 当前状态
        pos += path.consumes[step].length();

        if (int index = regex.group_map[state]) { // 找到对应的捕获组
            if (!in_group[index]) { // 捕获组开始
                group_pos[index].first = pos;
                in_group[index] = true;
            } else { // 捕获组结束
                group_pos[index].second = pos;
                in_group[index] = false;
            }
        }
    }

    // 记录匹配结束的位置
    group_pos[0].second = pos;

    return true;
}

std::vector<std::string> RegexMatcher::groups() const {
    std::vector<std::string> groups;
    groups.reserve(regex.group_count + 1);
    for (auto [begin, end] : group_pos) {
        // TODO: 处理捕获组未匹配的情况
        groups.push_back(text.substr(begin, end - begin));
    }
    return groups;
}

void RegexMatcher::appendReplacement(std::string &target, const std::string &replacement) const {
    for (int i = 0; i < (int)replacement.length(); i++) {
        if (replacement[i] == kGroupMarker) {
            char next = replacement[i + 1];
            if (next == kGroupMarker) { // 转义的特殊字符
                target.push_back(kGroupMarker);
                i++;
                continue;
            } else if (std::isdigit(next)) { // 捕获组
                int index = 0;
                do {
                    index = index * 10 + (next - '0');
                    next = replacement[++i];
                } while (std::isdigit(next));
                if (index <= regex.group_count) {
                    auto [begin, end] = group_pos[index];
                    target.append(text, begin, end - begin);
                }
                continue;
            }
        }
        target.push_back(replacement[i]);
    }
}
