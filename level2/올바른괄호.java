import java.util.*;

public class 올바른괄호 {
    public boolean solution(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                deque.push('(');
            } else if (s.charAt(i) == ')') {
                if (deque.isEmpty()) {
                    return false;
                } else {
                    deque.pop();
                }
            }
        }
        return (deque.isEmpty()) ? true : false;
    }

    public static void main(String[] args) {

        올바른괄호 answer = new 올바른괄호();
        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";
        System.out.println("answer.solution() = " + answer.solution(s1));
        System.out.println("answer.solution() = " + answer.solution(s2));
        System.out.println("answer.solution() = " + answer.solution(s3));
        System.out.println("answer.solution() = " + answer.solution(s4));
    }
}
