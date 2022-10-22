package programmers.level3;

import java.util.*;

public class 거스름돈 {
    public int solution(int n, int[] money) {
        int answer = 0;
        int[][] dp = new int[money.length + 1][n + 1];
        Arrays.sort(money);
        for (int i = 1; i <= money.length; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 ){
                    dp[i][j] = 1;
                } else {
                    if (j < money[i-1])
                        dp[i][j] = dp[i-1][j];
                    else {
                        dp[i][j] = (dp[i-1][j] + dp[i][j - money[i - 1]]) % 1000000007;
                    }
                }
            }
        }

        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        return dp[money.length][n];
    }

    public static void main(String[] args) {
        거스름돈 answer = new 거스름돈();
        System.out.println("answer.solution(5, new int[] {1,2,5}) = " + answer.solution(5, new int[] {1,2,5}));
    }
}
