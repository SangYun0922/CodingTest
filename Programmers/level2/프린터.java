package level2;
import java.util.*;
public class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> result = new ArrayList<>();
        List<Integer> prior_list = new ArrayList<>();
        Deque<List<Integer>> deque = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i++) {
            prior_list.add(priorities[i]);
            List<Integer> tmp = new ArrayList<>();
            tmp.add(priorities[i]);
            tmp.add(i);
            deque.add(tmp);
        }

        while (!deque.isEmpty()) {
            List<Integer> tmp = deque.poll(); // 맨 앞에있는 것 꺼냄
            if (tmp.get(0) == Collections.max(prior_list)) {
                result.add(tmp.get(1));
                prior_list.set(tmp.get(1), -1);
            } else {
                deque.add(tmp);
            }
        }
        return result.indexOf(location) + 1;
    }

    public static void main(String[] args) {
        프린터 answer = new 프린터();
        System.out.println("answer.solution(new int[] {2,1,3,2}, 2) = " + answer.solution(new int[] {2,1,3,2}, 2));
    }
}
