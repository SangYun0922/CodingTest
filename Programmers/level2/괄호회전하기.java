package programmers.level2;

import java.util.*;

public class 괄호회전하기 {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            String new_s = ""; // 회전한 String
            for (int j = i; j < s.length(); j++) {
                new_s += s.charAt(j);
            }
            for (int j = 0 ; j < i; j++) {
                new_s += s.charAt(j);
            }
            if (check(new_s)) {
                answer++;
            }
        }
        return answer;
    }

    public boolean check(String new_s) { // 올바른 건지 체크
        Deque<Character> deque = new ArrayDeque<>();
        char prefix = new_s.charAt(0);
        if (prefix == '}' || prefix == ')' || prefix == ']') {
            return false;
        }

        for (int i = 0; i < new_s.length(); i++) {
            // 여는 괄호가 나오면 넣고, (
            // 닫는 괄호가 나오면 pop
            if (new_s.charAt(i) == '(' || new_s.charAt(i) == '{' || new_s.charAt(i) == '[') {
                deque.push(new_s.charAt(i));
            } else {
                if (deque.isEmpty())
                    return false;
                else if (new_s.charAt(i) == ')') {
                    if (deque.peek() != '(') {
                        return false;
                    }
                    deque.pop();
                }
                else if (new_s.charAt(i) == '}') {
                    if (deque.peek() != '{') {
                        return false;
                    }
                    deque.pop();
                }
                else if (new_s.charAt(i) == ']') {
                    if (deque.peek() != '[') {
                        return false;
                    }
                    deque.pop();
                }
            }
        }
        if (!deque.isEmpty())
            return false;
        return true;
    }
    public static void main(String[] args) {
        괄호회전하기 answer = new 괄호회전하기();
        System.out.println("answer.solution(\"[](){}\") = " + answer.solution("[](){}"));
        System.out.println("answer.solution(\"[](){}\") = " + answer.solution("}]()[{"));
        System.out.println("answer.solution(\"[](){}\") = " + answer.solution("[)(]"));
        System.out.println("answer.solution(\"[](){}\") = " + answer.solution("}}}"));
        System.out.println("answer.solution(\"[](){}\") = " + answer.solution("{(})"));
    }
}
