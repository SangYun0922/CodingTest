package baekjoon.이분탐색.나무자르기_2805;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 나무 담기
        }
        long L = 0;
        long R = Arrays.stream(arr).max().getAsInt(); // 자를 수 있는 위치를 선정하기, 최소 0부터 가장 큰 나무의 높이까지 자를 수 있다.
        int max_h = Integer.MIN_VALUE; // 최대 높이(H)를 저장하기 위한 변수
        while(L <= R) { // 이분탐색으로 최대 H를 탐색
            long mid = (L + R) / 2;
            long sum = 0; // 이때, 나무의 길이는 최대 10억이고, 나무의 개수는 최대 100만개이기 때문에 최악의 경우 10^15을 저장해야한다. 따라서, long으로 선언
            for (int e : arr) {
                sum += e - mid > 0 ?  e - mid : 0;
            }
            if (sum >= M) {
                if (mid > max_h)
                    max_h = (int) mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        System.out.println(max_h);
    }
}
