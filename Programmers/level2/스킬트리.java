package programmers.level2;

import java.util.*;
public class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String e : skill_trees) {
            Deque<Character> deque = new ArrayDeque<>();
            Set<Character> skill_list = new HashSet<>();

            for (int i = 0; i < skill.length(); i++) {
                deque.add(skill.charAt(i));
                skill_list.add(skill.charAt(i));
            }
            boolean flag = true;
            for (int i = 0; i < e.length(); i++ ) {
                char word = e.charAt(i);
                if (skill_list.contains(word)) {
                    if (word == deque.peek()) {
                        char tmp = deque.poll();
                        skill_list.remove(tmp);
                    } else {
                        flag = false;
                        break;
                    }
                } else {
                    continue;
                }
            }
            if (flag)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        스킬트리 answer = new 스킬트리();
        System.out.println("answer.solution(\"CBD\", new String[] {\"BACDE\", \"CBADF\", \"AECB\", \"BDA\"}) = " + answer.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
    }
}
