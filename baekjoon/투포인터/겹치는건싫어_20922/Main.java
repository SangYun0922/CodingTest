package baekjoon.투포인터.겹치는건싫어_20922;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] check = new int[200001];
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] a = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 0;
        int distance = Integer.MIN_VALUE;
        while(true) {
            if (right <= N - 1) {
                if (check[a[right]] < K) {
                    check[a[right]] ++;
                    distance = Math.max(distance, right - left + 1);
                    right++;
                } else if (check[a[right]] == K) {
                    check[a[left]] --;
                    left++;
                }
            }
            if (right > N - 1)
                break;
        }
        System.out.println(distance);
    }
}
