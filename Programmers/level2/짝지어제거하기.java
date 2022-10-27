package level2;

import java.util.*;
public class 짝지어제거하기 {
    public int solution(String s)
    {
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {

            if (i == 0)
                deque.push(s.charAt(i));
            else {
                if (deque.isEmpty()) {
                    deque.push(s.charAt(i));
                    continue;
                }
                if (s.charAt(i) == deque.peek()) {
                    deque.pop();
                } else {
                    deque.push(s.charAt(i));
                }
            }
        }
        if (deque.isEmpty())
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        짝지어제거하기 answer = new 짝지어제거하기();
        System.out.println("answer.solution(\"baabaa\") = " + answer.solution("baabaa"));
    }
}
