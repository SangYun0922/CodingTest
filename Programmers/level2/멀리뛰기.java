package programmers.level2;

public class 멀리뛰기 {
    public long solution(int n) {
        long[] dp = new long[2001];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        멀리뛰기 answer = new 멀리뛰기();
        System.out.println("answer.solution(4) = " + answer.solution(4));
    }
}
