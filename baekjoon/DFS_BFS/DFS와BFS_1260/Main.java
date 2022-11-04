package baekjoon.DFS_BFS.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static int[][] map;
    public static boolean[] visited;
    public static int N;
    public static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        map = new int[N+1][N+1];
        visited = new boolean[N+1];
        sb.append(V + " ");
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
            map[y][x] = 1;
        }

        dfs(V);
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());
        visited = new boolean[N+1]; //방문기록 초기화
        sb = new StringBuffer(); //StringBuffer 초기화
        sb.append(V + " ");
        bfs(V);
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());
    }

    public static void dfs(int v) {
        visited[v] = true;

        for (int i = 0; i <= N; i++) {
            if (!visited[i] && map[v][i] == 1) {
                visited[i] = true;
                sb.append(i + " ");
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(v);
        visited[v] = true;

        while(!deque.isEmpty()) {
            int x = deque.poll();
            for (int i = 0; i <= N; i++) {
                if (!visited[i] && map[x][i] == 1) {
                    visited[i] = true;
                    deque.offer(i);
                    sb.append(i + " ");
                }
            }
        }
    }

}
