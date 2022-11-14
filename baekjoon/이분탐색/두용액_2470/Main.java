package baekjoon.이분탐색.두용액_2470;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // -99 -2 -1 4 98
        int[] answer = new int[2]; // 용액들
        int min = Integer.MAX_VALUE; // 두 용액의 합

        for (int i = 0; i < arr.length; i++) {
            int L = i+1;
            int R = arr.length - 1;
            while (L <= R) {
                int mid = (L + R) / 2;
                int abs = Math.abs(arr[mid] + arr[i]);
                if (abs < min) {
                    min = abs;
                    answer[0] = arr[mid];
                    answer[1] = arr[i];
                }
                if (arr[mid] + arr[i] < 0)
                    L = mid + 1;
                else
                    R = mid - 1;
            }
        }

        Arrays.sort(answer);
        System.out.println(answer[0] + " " + answer[1]);
    }
}
