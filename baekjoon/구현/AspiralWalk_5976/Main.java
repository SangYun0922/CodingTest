package baekjoon.AspiralWalk_5976;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        int num = 1;
        int f = 0; // level
        while (num <= N * N) {
            // 윗부분
            for (int i = f; i < N - f; i++) {
                arr[f][i] = num;
                num++;
            }

            // 오른쪽 부분
            int k = f + 1;
            for (int i = k; i < N - f; i++) {
                arr[i][N - 1 - f] = num;
                num++;
            }

            k = N - 2 - f;
            for (int i = k; i >= f; i--) {
                arr[N - 1 - f][i] = num;
                num++;
            }

            k = N - 2 - f;
            for (int i = k; i > f; i--) {
                arr[i][f] = num;
                num++;
            }

            f++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
