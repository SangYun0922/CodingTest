package baekjoon.구현.피보나치수_2747;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int fibo(int N) {
        int[] num = new int[N+1];
        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i <= N; i++) {
            num[i] = num[i-1] + num[i-2];
        }
        return num[N];
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fibo(N));
    }
}
