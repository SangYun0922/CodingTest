package programmers.level2;

import java.util.*;
public class 연속부분수열합의개수 {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int[] num = new int[elements.length * 2];

        for (int i = 0; i < num.length; i++) {
            num[i] = elements[i % elements.length];
        }

        int R = 0;
        int sum = 0;

        for (int L = 0; L < elements.length; L++) {
            if (L != 0) {
                sum = 0;
                R = L;
            }

            while(R - L < elements.length) {
                sum += num[R];
                set.add(sum);
                R++;
            }
            set.add(num[L]);
        }
        return set.size();
    }
}
