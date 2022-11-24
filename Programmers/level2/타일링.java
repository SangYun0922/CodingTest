package programmers.level2;

public class 타일링 {
    public int solution(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
            dp[i] %= 1000000007;
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        타일링 answer = new 타일링();
        System.out.println("answer.solution(4) = " + answer.solution(4));
    }
}
