package programmers.level3;

import java.util.*;

public class N으로표현 {

    public int solution(int N, int number) {
        int answer = 0;
        List<Set<Integer>> cache = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            cache.add(new HashSet<Integer>());
        }

        cache.get(1).add(N);

        for (int i = 2; i < 9; i++) {
            Set<Integer> num_set = cache.get(i);

            for (int j = 1; j < i; j++) {
                Set<Integer> pre_set = cache.get(j);
                Set<Integer> post_set = cache.get(i - j);

                for (Integer pre_num : pre_set) {
                    for (Integer post_num : post_set) {
                        num_set.add (pre_num + post_num);
                        num_set.add (pre_num - post_num);
                        num_set.add (pre_num * post_num);

                        if (post_num != 0)
                            num_set.add(pre_num / post_num);
                    }
                }
            }
            num_set.add(Integer.parseInt(String.valueOf(N).repeat(i)));
        }

        for (int i = 1; i < 9; i++) {
            if (cache.get(i).contains(number))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        N으로표현 answer = new N으로표현();
        System.out.println("answer.solution(5, 12) = " + answer.solution(5, 12));
    }
}
