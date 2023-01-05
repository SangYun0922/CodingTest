package baekjoon.유기농배추_1012;

import java.io.*;
import java.util.*;

public class Main {
    public static int M, N;
    public static int[][] map;
    public static int[] dr = {1, -1, 0, 0};
    public static int[] dc = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int answer = 0;

            map = new int[M][N];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[x][y] = 1;
            }
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[0].length; j++) {
                    if (map[i][j] == 1) {
                        bfs(i, j);
                        answer++;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(answer);
            sb.append('\n');

            bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }

    public static void bfs(int r, int c) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[] {r, c});
        map[r][c] = 2;

        while(!deque.isEmpty()) {
            int[] temp= deque.poll();
            int cur_r = temp[0];
            int cur_c = temp[1];

            for (int i = 0; i < 4; i++) {

                int n_r = cur_r + dr[i];
                int n_c = cur_c + dc[i];

                if (n_r >= 0 && n_c >= 0 && n_r < M && n_c < N) {
                    if (map[n_r][n_c] == 1) {
                        deque.offer(new int[] {n_r, n_c});
                        map[n_r][n_c] = 2;
                    }
                }
            }
        }
    }
}
