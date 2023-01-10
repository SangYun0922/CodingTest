package baekjoon.점프왕쩰리Small_16173;

import java.io.*;
import java.util.*;

// visited배열 꼭 필요!
// 아래와 같이 배열이 있다고 해보자
// 1 1
// -1 1
// (0,0)에서 (1,0)으로 간 뒤, (1,0)에서 -1로 인하여 다시 (0,0)으로 가는 무한루프에 빠지기 때문이다.
public class Main {
    public static int[][] map;
    public static boolean[][] visited;
    public static int N;
    public static int[] dr = new int[] {1 , 0};
    public static int[] dc = new int[] {0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean flag = bfs(0, 0);
        StringBuilder sb = new StringBuilder();
        if (flag)
            sb.append("HaruHaru");
        else
            sb.append("Hing");

        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static boolean bfs(int r, int c) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[] {r, c});

        while(!deque.isEmpty()) {
            int[] tmp = deque.poll();
            int cur_r = tmp[0];
            int cur_c = tmp[1];
            visited[cur_r][cur_c] = true;

            for (int i = 0; i < 2; i++) {
                int n_r = cur_r + dr[i] * map[cur_r][cur_c];
                int n_c = cur_c + dc[i] * map[cur_r][cur_c];

                if (n_r >= 0 && n_c >= 0 && n_r < N && n_c < N) {
                    if (!visited[n_r][n_c]) {
                        if (n_r == N-1 && n_c == N-1) {
                            return true;
                        }
                        visited[n_r][n_c] = true;
                        deque.offer(new int[] {n_r, n_c});
                    }
                }
            }
        }

        return false;
    }

}
