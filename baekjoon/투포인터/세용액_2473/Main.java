package baekjoon.투포인터.세용액_2473;

import java.util.*;
import java.io.*;

public class Main {

    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // -24 -6 -3 -2 61 98 100
        int[] answer = new int[3];
        long min_len =Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int L = 0;
            int R = arr.length - 1; // 처음과 끝을 포인터로 잡는다.
            while (L < R) {
                if (L == i) L++;
                else if (R == i) R--;

                if (L == R)
                    break;

                long sum = (long) arr[L] + arr[i] + arr[R];
                if (Math.abs(sum) < min_len) {
                    min_len = Math.abs(sum);
                    answer[0] = arr[L];
                    answer[1] = arr[i];
                    answer[2] = arr[R];
                }

                if (sum >= 0) {
                    R--;
                } else L++;
            }
        }
        Arrays.sort(answer);
        System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
    }
}
