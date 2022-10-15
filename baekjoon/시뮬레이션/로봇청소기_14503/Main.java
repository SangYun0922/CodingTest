package baekjoon.시뮬레이션.로봇청소기_14503;

import java.io.*;
import java.util.*;

public class Main {
    static int[] dr = {-1, 0, 1, 0}; // 북동남서
    static int[] dc = {0, 1, 0, -1}; // 북동남서
    static int N = 0;
    static int M = 0;
    static int[][] map;
    static boolean[][] check;
    static int count = 0;

    public static void clear(int r, int c, int d) {
        boolean bool = false;
        int cur_d = d; // 현재 바라보는 위치 저장
        if (!check[r][c]) {
            check[r][c] = true;
            count++;
        }

        for (int i = 0; i < 4; i++) {
            int dir = (d + 3) % 4;
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr < N && nc < M && nr > 0 && nc > 0) {
                if (!check[nr][nc] && map[nr][nc] == 0) {
                    clear(nr,nc,dir);
                    bool = true;
                    break;
                }
            }
            d = dir;
        }

        if (!bool) {
            int b_dir = (cur_d + 2) % 4;
            int br = r + dr[b_dir];
            int bc = c + dc[b_dir];

            if (br < N && bc < M && br > 0 && bc > 0) {
                if (map[br][bc] != 1) {
                    clear(br,bc,cur_d);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        check = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        clear(r, c, d);
        System.out.println(count);
    }

}
