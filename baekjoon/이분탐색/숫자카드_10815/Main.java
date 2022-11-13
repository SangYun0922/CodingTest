package baekjoon.이분탐색.숫자카드_10815;

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

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int[] nums = new int[M]; // 10 9 -5 2 3 4 5 -10
        StringBuffer sb = new StringBuffer();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // -10 2 3 6 10

        for (int i = 0; i < nums.length; i++) {
            int L = 0;
            int R = N - 1;
            boolean flag = false;
            while (L <= R) {
                int mid = (L + R) / 2;

                if (nums[i] > arr[mid]) {
                    L = mid + 1;
                    continue;
                } else if (nums[i] < arr[mid]){
                    R = mid - 1;
                    continue;
                } else if (nums[i] == arr[mid]) {
                    flag = true;
                    break;
                }
            }
            if (flag) sb.append(1);
            else sb.append(0);

            sb.append(" ");
        }

        System.out.println(sb.delete(sb.length() - 1, sb.length())); // 공백제거
    }
}
