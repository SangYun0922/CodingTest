package programmers.level2;

import java.util.*;

public class 캐시 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new ArrayList<>();

        if (cacheSize == 0)
            return cities.length * 5;

        for (int i = 0; i < cities.length; i++) {
            String temp = cities[i].toLowerCase();

            if (cache.contains(temp)) {
                answer += 1;
                cache.remove(temp);
                cache.add(temp);
            } else {
                if (cache.size() < cacheSize) {
                    answer += 5;
                    cache.add(temp);
                } else {
                    answer += 5;
                    cache.remove(cache.get(0));
                    cache.add(temp);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        캐시 answer = new 캐시();
        System.out.println("answer.solution()" + answer.solution(2, new String[] {"Jeju", "Pangyo", "NewYork", "newyork"}));
    }

}
