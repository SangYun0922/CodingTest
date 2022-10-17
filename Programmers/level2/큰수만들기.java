import java.util.*;

public class 큰수만들기 {
    public String solution(String number, int k) {
        StringBuffer answer = new StringBuffer();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < number.length(); i++) {

            int tmp = Character.getNumericValue(number.charAt(i));
            if (deque.isEmpty()) {
                deque.add(tmp);
                continue;
            }

            if (k > 0) {
                while(deque.peekLast() < tmp) {
                    deque.pollLast();
                    k--;
                    if ( k <= 0 || deque.isEmpty())
                        break;
                }
            }
            deque.add(tmp);
        }

        if (k > 0) {
            for (int i = 0; i < number.length() - k; i++) {
                answer.append(deque.poll());
            }
        } else {
            for (Integer e : deque) {
                answer.append(e);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        큰수만들기 answer = new 큰수만들기();
        System.out.println("answer.solution(\"1924\", 2) = " + answer.solution("1924", 2));
    }
}
