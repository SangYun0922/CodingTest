package baekjoon.투포인터.수고르기_2230;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);
        int R = 1; int min_len = Integer.MAX_VALUE;

        for (int L = 0; L < N; L++) {
            while ( R < N-1 && num[R] - num[L] < M) {
                R++;
            }

            if (num[R] - num[L] >= M)
                min_len = Math.min(min_len, num[R]-num[L]);
        }
        System.out.println(min_len);
    }
}
