package baekjoon.편의점2_14400;

import java.io.*;
import java.util.*;

// 주요 고객들의 위치가 주어지고 모든 고객들의 거리 합을 최소로하는 위치에 편의점을 세운다.
// |x1-x2| + |y1-y2|
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int r = arr[N/2][0];

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int c = arr[N/2][1];

        StringBuilder sb = new StringBuilder();
        long answer = 0;
        for (int i = 0; i < N; i++) {
            answer += Math.abs(r - arr[i][0]) + Math.abs(c - arr[i][1]);
        }

        sb.append(answer);
        sb.append('\n');

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
