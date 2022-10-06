package programmers.level1;

import java.util.Scanner;
import java.util.*;

public class level1_2016년 {
    public String solution(int a, int b) {
        int date = 0;
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < a-1 ; i++) {
            date += days[i];
        }
        date += b - 1; // b일 만큼 더하는 것이 아닌 b-1을 더한다.
        String answer = week[date%7];
        return answer;
    }

    public static void main(String[] args) {
        level1_2016년 answer = new level1_2016년();
        System.out.println("answer.solution(5, 24) = " + answer.solution(5, 24));
    }
    
}

