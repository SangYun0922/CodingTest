package programmers.level2;
import java.util.*;
public class 올바른괄호 {
    boolean solution(String s) { // 큐 안쓴 풀이
        int answer = 0;
        if (s.charAt(0) == ')')
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                answer++;
            else if (answer > 0)
                answer--;
            else
                return false;
        }
        return (answer == 0);
    }

    boolean solution_queue(String s) { //큐 쓴 풀이
        Deque<String> deque = new ArrayDeque<>();
        if (s.charAt(0) == ')')
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                deque.push("(");
            else {
                if (deque.isEmpty())
                    return false;
                else {
                    deque.pop();
                }
            }
        }
        return deque.isEmpty();
    }
    public static void main(String[] args) {
        올바른괄호 answer = new 올바른괄호();
        System.out.println("answer.solution = " + answer.solution("(()("));
    }
}
