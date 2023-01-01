package baekjoon.뒤집기2_1455;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = N-1; i >= 0; i--) {
            for (int j = M-1; j >= 0; j--) {
                if (arr[i][j] == 1) {
                    answer++;
                    Reverse(i, j);
                }
            }
        }

        sb.append(answer);
        sb.append('\n');

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void Reverse(int r, int c) {
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= c; j++) {
                arr[i][j] = 1 - arr[i][j];
            }
        }
    }
}
