package programmers.level2;

import java.util.*;
public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;
        for (; i <= j; j--) {
            if (people[i] + people[j] > limit)
                answer++;
            else {
                answer++;
                i++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        구명보트 answer = new 구명보트();
        System.out.println("answer.solution() = " + answer.solution(new int[] {70, 50, 80, 50}, 100));
    }
}
