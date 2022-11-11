package baekjoon.투포인터.주몽_1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        int[] nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        int start = 0;
        int end = N -1;
        int cnt = 0;
        while(start < end) {
            if (nums[start] + nums[end] > M) {
                end--;
            } else if (nums[start] + nums[end] < M) {
                start++;
            } else {
                start++;
                end--;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
