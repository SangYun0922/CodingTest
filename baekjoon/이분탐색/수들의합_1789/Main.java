package baekjoon.이분탐색.수들의합_1789;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long start= 1;
        long end = S;
        long answer = 0;
        while(start <= end) {
            long mid = (start + end) / 2;
            long sum =  mid * (mid + 1) / 2;
            if (sum <= S) {
                answer = mid;
                start = mid + 1;
            } else
                end = mid -1;
        }
        System.out.println(answer);
    }

}
