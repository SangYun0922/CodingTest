package baekjoon.서강근육맨_20300;

// 자극이 잘 안오면 근손실이 적게온다. 자극이 잘 오면 근손실이 많이 온다.
// pt를 한번 받을 때 근손실의 정도가 M을 넘지 않도록 한다.
// M의 최솟값을 구하자

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        if (N % 2 != 0) { // 홀수 일때
            long  M = arr[N-1];
            for (int i = 0; i < (N-1) / 2; i++) {
                if (M < arr[i] + arr[N-2-i])
                    M = arr[i] + arr[N-2-i];
            }
            System.out.println(M);
        } else { // 짝수 일때
            Long M = Long.MIN_VALUE;
            for (int i = 0; i < N/2; i++) {
                if (M < arr[i] + arr[N-1-i])
                    M = arr[i] + arr[N-1-i];
            }
            System.out.println(M);
        }
    }
}
