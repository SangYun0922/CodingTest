package baekjoon.이분탐색.먹을것인가먹힐것인가_7795;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] A = new int[N];
            int[] B = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(B); // 이분탐색을 위해서 B정렬

            int answer = 0;
            for (int i = 0; i < A.length; i++) {
                int idx = Integer.MIN_VALUE;
                int L = 0;
                int R = B.length - 1;
                while (L <= R) {
                    int mid = (L + R) / 2;
                    if (A[i] <= B[mid]) { // 만약 A가 B보다 작아서 먹을 수 없는 경우, R을 mid보다 앞에 배치하여 작은쪽 탐색
                        R = mid - 1;
                        continue;
                    } else { // 만약 A가 B보다 커서 먹을 수 있다면, A보다 앞에 있는 녀석들은 다 먹을 수 있으므로, A의 최대 인덱스 저장
                        if (mid >= idx)
                            idx = mid;
                        L = mid + 1;
                        continue;
                    }
                }
                if (idx != Integer.MIN_VALUE)
                    answer += idx + 1;
            }
            System.out.println(answer);
        }
    }
}
