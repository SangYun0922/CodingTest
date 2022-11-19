package baekjoon.투포인터.수들의합5_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = i+1;

        int R = 0;
        int sum = 0;
        int answer = 0;
        for (int L = 0; L < N; L++) {
            if (L != 0)
                sum -= (arr[L - 1]);
            while (R < N & sum < N) {
                sum += arr[R];
                R++;
            }

            if (sum == N)
                answer++;
        }
        System.out.println(answer);
    }
}


