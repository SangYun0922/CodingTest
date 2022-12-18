package baekjoon.귀찮음_16208;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); //
        long x = Arrays.stream(arr).sum();
        long answer = 0;
        for (int i = 0; i < N-1; i++) {
            answer += (x - arr[i]) * arr[i];
            x -= arr[i];
        }

        System.out.println(answer);
    }
}
