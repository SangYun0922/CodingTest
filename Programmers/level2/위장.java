package level2;

import java.util.*;
public class 위장 {

    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> combination = new HashMap<>();

        for (String[] e : clothes) {
            String kind = e[1];
            if (combination.containsKey(kind)) {
                combination.put(kind, combination.get(kind) + 1);
            } else {
                combination.put(kind, 1);
            }
        }

        if (combination.size() == 1) {
            return combination.get(clothes[0][1]);
        } else {
            List<String> keys = new ArrayList<>(combination.keySet());
            for (String e : keys) {
                answer *= (combination.get(e) + 1);
            }
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        위장 answer = new 위장();
        System.out.println("answer.solution() = " + answer.solution(new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
    }
}
