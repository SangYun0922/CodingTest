package baekjoon.배열.두수의합_3273;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        boolean[] check = new boolean[2000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++)
            nums[i] = Integer.parseInt(st.nextToken());

        int X = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (X - nums[i] > 0 && check[X-nums[i]])
                answer++;
            check[nums[i]] = true;
        }
        System.out.println(answer);
    }
}
