package level2;

import java.util.*;
public class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        int L = 0; int R = 9; int cnt = 0;
        while(R < discount.length) {
            boolean flag = true;
            Map<String, Integer> tmp = new HashMap<>();
            for (int i = L; i <= R; i++) {
                tmp.put(discount[i], tmp.getOrDefault(discount[i], 0) + 1);
            }
            for (String e : map.keySet()) {
                if (map.get(e) != tmp.get(e)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cnt++;
            }
            L++;
            R++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        할인행사 answer = new 할인행사();
//        System.out.println("answer.solution() = " + answer.solution());
    }
}
