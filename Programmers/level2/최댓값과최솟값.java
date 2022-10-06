package programmers.level2;

import java.util.*;

public class 최댓값과최솟값 {

    public String solution(String s) {
        String[] temp = s.split("\\s+");
        int[] values = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
        return Arrays.stream(values).min().getAsInt() + " " + Arrays.stream(values).max().getAsInt();
    }

    public static void main(String[] args) {
        최댓값과최솟값 answer = new 최댓값과최솟값();
        System.out.println("answer.solution(\"1 2 3 4\") = " + answer.solution("-1 -2 -3 -4"));
    }
}
