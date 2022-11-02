package programmers.level2;

import java.util.*;

public class 모음사전 {
    public int solution(String word) {
        int answer = word.length();
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('A', 1);
        dict.put('E', 2);
        dict.put('I', 3);
        dict.put('O', 4);
        dict.put('U', 5);

        int[] interval = {781,156,31,6,1};

        for (int i = 0; i < word.length(); i++) {
            char tmp = word.charAt(i);
            answer += (dict.get(tmp) - dict.get('A')) * interval[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        모음사전 answer = new 모음사전();
        System.out.println("answer.solution(\"AAAAE\") = " + answer.solution("AAAAE"));
    }
}
