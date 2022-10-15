package baekjoon.그래프.토마토_7576;

import java.io.*;
import java.util.*;
public class Main {
    static int N, M;
    static int[][] box;
    static Deque<int[]> deque = new ArrayDeque<>();
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0, 0,1,-1};
    public static int bfs() {
        while(!deque.isEmpty()) {
            int[] loc = deque.pop();
            int x = loc[0];
            int y = loc[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (box[nx][ny] == 0) {
                        box[nx][ny] = box[x][y] + 1;
                        deque.add(new int[] {nx, ny});
                    }
                }
            }
        }

        int max_num = Integer.MIN_VALUE;

        for (int i = 0 ; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0)
                    return -1;
                if (box[i][j] >= max_num)
                    max_num = box[i][j];
            }
        }
        return max_num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];
        for (int i = 0 ; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    deque.add(new int[] {i,j});
                }
            }
        }

        System.out.println(bfs());
        for (int i = 0 ; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(box[i][j] + " ");
            }
            System.out.println();
        }
    }
}
