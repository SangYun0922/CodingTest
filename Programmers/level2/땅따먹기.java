package programmers.level2;

// 행의 개수는 N, 열의 개수는 4개 고정
import java.util.*;

public class 땅따먹기 {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dp = new int[land.length][4];
        dp[0] = land[0];

        for (int i = 1; i < land.length; i++) {
            dp[i][0] += land[i][0] + Math.max(dp[i-1][1],Math.max(dp[i-1][2],dp[i-1][3]));
            dp[i][1] += land[i][1] + Math.max(dp[i-1][0],Math.max(dp[i-1][2],dp[i-1][3]));
            dp[i][2] += land[i][2] + Math.max(dp[i-1][0],Math.max(dp[i-1][1],dp[i-1][3]));
            dp[i][3] += land[i][3] + Math.max(dp[i-1][0],Math.max(dp[i-1][1],dp[i-1][2]));

        }

        answer = Arrays.stream(dp[land.length - 1]).max().getAsInt();
        return answer;
    }

    public static void main(String[] args) {
        땅따먹기 answer = new 땅따먹기();
//        System.out.println("answer.solution() = " + answer.solution());
    }
}
