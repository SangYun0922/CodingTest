package baekjoon.투포인터.수들의합2_2003;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        int L = 0, R = 0, sum = 0, answer = 0;
        while(L < N) {
            if (sum > M || R == N) {
                sum -= A[L];
                L++;
            } else {
                sum += A[R];
                R++;
            } if (sum == M)
                answer++;
        }

        System.out.println(answer);
    }
}
