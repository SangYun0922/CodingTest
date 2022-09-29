package programmers.level2;

import java.util.Arrays;

public class 최솟값만들기 {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++)
            answer += A[i] * (B[A.length-1 - i]);
        return answer;
    }

    public static void main(String[] args) {
        최솟값만들기 answer = new 최솟값만들기();
        System.out.println("answer.solution(new int[] {1,4,2}, new int[] {5,4,4}) = " + answer.solution(new int[] {1,4,2}, new int[] {5,4,4}));
    }
}
