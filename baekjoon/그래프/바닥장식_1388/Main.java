package baekjoon.바닥장식_1388;

import java.io.*;
import java.util.*;

// 가로 체크 -> 방문했다면 배열 2로 표시
// 세로 체크 -> 방문했다면 배열을 3으로 표시
public class Main {
    public static int N, M;
    public static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                if (arr[j].equals("|")) {
                    map[i][j] = 1;
                } else
                    map[i][j] = 0;
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) { // debug
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    horizon_bfs(i, j);
                    cnt++;
                } else if (map[i][j] == 1) {
                    vertical_bfs(i, j);
                    cnt++;
                }
            }
        }

//        for (int i = 0; i < N; i++) { // debug
//            for (int j = 0; j < M; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }

        StringBuilder answer = new StringBuilder();
        answer.append(cnt);
        answer.append('\n');

        bw.write(answer.toString());
        bw.flush();
        bw.close();
    }

    public static void horizon_bfs(int r, int c) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[] {r, c});
        map[r][c] = 2;

        while(!deque.isEmpty()) {
            int[] tmp = deque.poll();
            int cur_r = tmp[0];
            int cur_c = tmp[1];
            int n_c = cur_c + 1;

            if (n_c >= 0 && n_c < M ) {
                if (map[cur_r][n_c] == 0) {
                    map[cur_r][n_c] = 2;
                    deque.offer(new int[] {cur_r, n_c});
                }
            }
        }
    }

    public static void vertical_bfs(int r, int c) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[] {r, c});
        map[r][c] = 3;

        while(!deque.isEmpty()) {
            int[] tmp = deque.poll();
            int cur_r = tmp[0];
            int cur_c = tmp[1];
            int n_r = cur_r + 1;

            if (n_r >= 0 && n_r < N ) {
                if (map[n_r][cur_c] == 1) {
                    map[n_r][cur_c] = 3;
                    deque.offer(new int[] {n_r, cur_c});
                }
            }
        }
    }
}
