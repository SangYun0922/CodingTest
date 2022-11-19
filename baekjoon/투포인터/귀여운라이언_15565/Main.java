package baekjoon.투포인터.귀여운라이언_15565;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int R = 0; int cnt = 0; int min_len = -1;

        for (int L = 0; L < N; L++) {
            if (L != 0 && arr[L-1] == 1)
                cnt--;

            while(R < N && cnt < K) {
                if (arr[R] == 1)
                    cnt++;
                R++;
            }

            if (cnt >= K) {
                if (min_len == -1) min_len = R - L;
                min_len = Math.min(min_len, R - L);
            }

        }
        System.out.println(min_len);
    }
}
