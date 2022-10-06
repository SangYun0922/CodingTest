package baekjoon.이분탐색.정수제곱근_2417;

import java.io.*;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long N = Long.parseLong(br.readLine());
//        long temp = (long) (Math.sqrt(N));
//        if (temp * temp < N)
//            temp++;
//        System.out.println(temp);
//    }


    // 이분 탐색
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long start = 0;
        long end = N; // 25
        long answer = 0;
        while (start <= end) {
            long mid = (start + end) / 2; // 12, 5, 2
            if (Math.pow(mid, 2) >= N) { // 144, 25
                answer = mid; // answer = 12, 5
                end = mid - 1; // 11, 4,
            } else {
                start = mid + 1; // 3
            }
        }
        System.out.println(answer);
    }
}

