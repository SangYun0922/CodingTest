package programmers.level2;

import java.util.*;
public class n2배열자르기 {
    public List<Long> solution(int n, long left, long right) {
        List<Long> list = new ArrayList<>();
        for (long i = left; i <= right; i++) {
            list.add(Math.max(i / n + 1, i % n + 1));
        }
        return list;
    }

    public static void main(String[] args) {
        n2배열자르기 answer = new n2배열자르기();
        System.out.println("answer.solution(3,2,5) = " + answer.solution(3,2,5));
    }
}
