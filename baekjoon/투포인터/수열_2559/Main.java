package baekjoon.투포인터.수열_2559;

// 투 포인터 알고리즘, 슬라이딩 윈도우 이용
import java.io.*;
import java.util.*;

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

        int L = 0; int R = K - 1; int max_num = Integer.MIN_VALUE;

        while(R < N) {
            int sum = 0;
            for (int i = L; i <= R; i++) {
                sum += arr[i];
            }

            max_num = Math.max(max_num, sum);

            L++;
            R++;
        }
        System.out.println(max_num);
    }
}
