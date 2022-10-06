package programmers.level3;

import java.util.*;

public class 입국심사 {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        return BinarySearch(times, n, times[times.length - 1]);
    }

    public long BinarySearch(int[] times, int n , long max) {
        long answer = 0;
        long start = 1;
        long end = (long) n * max;
        long mid = 0;
        while(start <= end) {
            mid = (start + end) / 2;
            long sum = 0;
            for (int i = 0; i < times.length; i++)
                sum += mid / times[i];
            if (sum >= n) {
                answer = mid;
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        입국심사 answer = new 입국심사();
        System.out.println("answer.solution(6, new int[] {7, 10}) = " + answer.solution(6, new int[] {7, 10}));
    }
}
