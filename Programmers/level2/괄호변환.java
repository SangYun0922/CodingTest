package programmers.level2;

import java.util.*;
public class 괄호변환 {
    public String solution(String p) {
        String answer = recursion(p);
        return answer;
    }

    public static String recursion(String p) {
        if (p.length() == 0)
            return "";

        String u = "";
        String v = "";

        int left = 0;
        int right = 0;

        // u, v 분리
        for (int i =0; i < p.length(); i++) {
            if (p.charAt(i) == '(')
                left++;
            else
                right++;
            if (left != 0 && right != 0 && left == right) {
                u = p.substring(0,i+1);
                v = p.substring(i+1);
                break;
            }
        }

        // 문쟈열 u가 올바른 괄호 문자열이라면 문자열 v에 대해 1단계부터 다시 수행
        if (isCorrect(u)) {
            return u + recursion(v);
        } else {
            String tmp = "(";
            tmp += recursion(v);
            tmp += ")";
            u = u.substring(1, u.length() - 1);

            for (int i = 0; i < u.length(); i++) {
                if (u.charAt(i) == ')')
                    tmp += '(';
                else
                    tmp += ')';
            }

            return tmp;
        }
    }

    public static boolean isCorrect(String u) {
        Deque<Character> deque = new ArrayDeque();

        if (u.charAt(0) == ')')
            return false;

        for (int i = 0; i < u.length(); i++) {
            char tmp = u.charAt(i);
            if (tmp == '(')
                deque.push(tmp);
            else {
                if (deque.isEmpty())
                    return false;
                else {
                    deque.pop();
                }
            }
        }

        if (deque.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        괄호변환 answer = new 괄호변환();
        System.out.println("answer.solution(\")(\") = " + answer.solution(")("));
    }
}
