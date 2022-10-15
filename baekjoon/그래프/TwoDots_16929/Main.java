package baekjoon.그래프.TwoDots_16929;

//현재 좌표를 기준으로 이전에 방문한 지점의 좌표로는 가면 안됨
// 즉, 이전 좌표로 가지 않았는데, 방문한 지점을 만났다면, 사이클 형성

import java.util.*;
import java.io.*;

public class Main {

    static int N, M;
    static String[][] map;
    static boolean[][] visited;
    static int[] dr = {1, -1, 0, 0};//남북동서
    static int[] dc = {0, 0, 1, -1};//남북동서
    public static boolean dfs(int x, int y, int prev_x, int prev_y, String dot) {
        if (visited[x][y])
            return true;

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dr[i];
            int ny = y + dc[i];

            if (nx != prev_x || ny != prev_y) {
                if (nx < N && ny < M && nx >= 0 && ny >= 0) {
                    if (map[nx][ny].equals(dot)) {
                        if (dfs(nx, ny, x, y, dot)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void solution(int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j])
                    continue;
                String dot = map[i][j];
                boolean res = dfs(i,j,i,j,dot);
                if (res) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
        return;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new String[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = Character.toString(temp.charAt(j));
            }
        }
        solution(N,M);

    }
}
