package baekjoon.이분탐색.수찾기_1920;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int[] B = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A); // 12345
        StringBuffer sb = new StringBuffer();
        for (int e : B) {
            int L = 0;
            int R = A.length - 1;
            boolean flag = false;
            while(L <= R) { // 만약 찾고자 하는 수가 배열의 맨 끝에 있다면? 이때는 L과 R이 모두 배열의 끝을 가리켜야 한다. 따라서 등호가 들어가야한다.
                int mid = (L + R) / 2;

                if (e == A[mid]) {
                    flag = true;
                    break;
                } else if (e > A[mid])
                    L = mid + 1;
                else if (e < A[mid])
                    R = mid - 1;
            }

            if (flag) sb.append(1);
            else sb.append(0);
        }
        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.toString().charAt(i));
        }
    }
}
