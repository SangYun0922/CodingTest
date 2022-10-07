package baekjoon.투포인터.배열합치기_11728;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int[] B = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            B[i] = Integer.parseInt(st.nextToken());
        StringBuffer sb = new StringBuffer();
        int A_L = 0, B_L = 0;
        while(A_L + B_L < M+N) {
            if (A_L == N)
                sb.append(B[B_L++] + " ");
            else if (B_L == M)
                sb.append(A[A_L++] + " ");
            else {
                if (A[A_L] <= B[B_L]) {
                    sb.append(A[A_L] + " ");
                    A_L++;
                } else {
                    sb.append(B[B_L] + " ");
                    B_L++;
                }
            }
        }
        sb.delete(sb.length()-1, sb.length());
        System.out.println(sb);
    }
}
