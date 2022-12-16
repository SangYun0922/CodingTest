package baekjoon.달팽이_1913;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];
        int K = N * N;
        int f = 0; // level

        while(K >= 1) {

            int p = f;
            for (int i = f; i <= N - 1 - f; i++) {
                arr[i][f] = K;
                K--;
            }

            p = f + 1;
            for (int i = p; i <= N - 1 - f; i++) {
                arr[N - 1 - f][i] = K;
                K--;
            }

            p = N - 2 - f;
            for (int i = p; i >= f; i--) {
                arr[i][N-1-f] = K;
                K--;
            }

            p = N - 2 - f;
            for (int i = p; i >= f + 1; i--) {
                arr[f][i] = K;
                K--;
            }
            f++;
        }

        StringBuffer sb = new StringBuffer();
        int r = 0; int c = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j] + " ");
                if (arr[i][j] == target) {
                    r = i+1;
                    c = j+1;
                }
            }
            sb.append('\n');
        }
        sb.append(r + " " + c);
        bw.write(sb.toString() + '\n');
        bw.flush();
        bw.close();
    }
}
