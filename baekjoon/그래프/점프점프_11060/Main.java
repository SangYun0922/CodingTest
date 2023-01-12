package baekjoon.점프점프_11060;

import java.util.*;
import java.io.*;

public class Main {
    public static int N, answer;
    public static int[] arr, visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new int[N];
        for (int i = 0; i < N; i++)
            visited[i] = -1;
        answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = bfs(0);
        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        sb.append('\n');

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int bfs(int r) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(r);
        visited[r] = 0;

        while(!deque.isEmpty()) {
            int cur_r = deque.poll();

            for (int i = 1; i <= arr[cur_r]; i++) {
                int n_r = cur_r + i;

                if (n_r >= N)
                    break;

                if (visited[n_r] == -1) {
                    visited[n_r] = visited[cur_r] + 1;
                    deque.offer(n_r);
                }

            }
        }

        if (visited[N-1] == -1)
            return -1;
        else return visited[N-1];
    }
}
