package baekjoon.DFS_BFS.바이러스_2606;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int[][] matrix;
    static int answer = 0;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine());
        StringTokenizer st;
        matrix = new int[N+1][N+1];
        visited = new boolean[N+1];

        for (int i = 0; i < edges; i++) {
             st = new StringTokenizer(br.readLine());
             int x = Integer.parseInt(st.nextToken());
             int y = Integer.parseInt(st.nextToken());
             matrix[x][y] = 1;
             matrix[y][x] = 1;
        }

        dfs(1);
        System.out.println(answer-1); // 나 자신은 빼야 하므로
    }
    public static void dfs(int r) {
        visited[r] = true;
        answer++;

        for (int i = 1; i <= N ; i++) {
            if (matrix[r][i] == 1 && !visited[i]) {
                visited[i] = true;
                dfs(i);
            }
        }
    }
}
