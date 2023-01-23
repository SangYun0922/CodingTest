package baekjoon.결혼식_5567;
// 친구의 친구까지 초대
import java.io.*;
import java.util.*;

public class Main {
    public static int N, answer;
    public static List<List<Integer>> adj;
    public static int[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        adj = new ArrayList<>();
        check = new int[N+1];

        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
            check[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < M ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj.get(y).add(x);
            adj.get(x).add(y);
        }

        dfs(1, 0);

        for (int i = 0; i <= N; i++) {
            if (check[i] <= 2 && check[i] > 0)
                answer++;
        }
        System.out.println(answer);
    }

    public static void dfs(int x, int level) {
        check[x] = Math.min(check[x], level);
        int next = level + 1;

        if (level <= 2) {
            for (int i = 0; i < adj.get(x).size(); i++) {
                int temp = adj.get(x).get(i);
                dfs(temp, next);
            }
        }
    }
}