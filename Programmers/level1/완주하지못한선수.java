package programmers.level1;

import java.util.*;
public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> player = new HashMap<>();

        for (String e : participant) {
            if (player.containsKey(e)) {
                player.put(e, player.get(e) + 1);
            } else
                player.put(e, 1);
        }

        for (String e : completion) {
            if (player.get(e) > 1) {
                player.put(e, player.get(e) - 1);
            } else
                player.remove(e);
        }

        List<String> res = new ArrayList<>(player.keySet());
        return res.get(0);
    }

    public static void main(String[] args) {
        완주하지못한선수 answer = new 완주하지못한선수();
//        System.out.println("answer = " + answer);
    }
}
