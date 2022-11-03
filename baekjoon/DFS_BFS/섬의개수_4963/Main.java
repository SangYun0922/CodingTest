package baekjoon.DFS_BFS.섬의개수_4963;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
    public static int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[][] map;
    public static boolean[][] visited;
    public static int w;
    public static int h;
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 & h == 0) break;

            map = new int[h][w];
            visited = new boolean[h][w];
            int answer = 0;

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        bfs(i ,j);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }

    public static void bfs(int x, int y) {
        Deque<int[]> deque = new ArrayDeque<>();
        int[] point = new int[] {x, y};
        deque.offer(point);
        visited[x][y] = true;

        while(!deque.isEmpty()) {
            int[] loc = deque.poll();
            int r = loc[0];
            int c = loc[1];

            for (int i = 0; i < 8; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nc >= 0 && nr < h && nc < w) {
                    if (!visited[nr][nc] && map[nr][nc] == 1) {
                        visited[nr][nc] = true;
                        deque.offer(new int[] {nr, nc});
                    }
                }
            }
        }
    }
}
