package programmers.level3;

public class 등굣길 {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[n][m];
        int[][] map = new int[n][m];
        dp[0][0] = 1;

        for (int[] e : puddles) {
            map[e[1] - 1][e[0] - 1] = -1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == -1) {
                    continue;
                } else {
                    if (j >= 1 && map[i][j-1] != -1)
                        dp[i][j] += dp[i][j-1];
                    if (i >= 1 && map[i-1][j] != -1)
                        dp[i][j] += dp[i-1][j];
                    dp[i][j] %= 1000000007;
                }
            }
        }

        return dp[n-1][m-1];
    }
    
    public static void main(String[] args) {
        등굣길 answer = new 등굣길();
        System.out.println("answer.solution(4, 3,new int[][] {{2,2}}) = " + answer.solution(4, 3,new int[][] {{2,2}}));
    }
}
