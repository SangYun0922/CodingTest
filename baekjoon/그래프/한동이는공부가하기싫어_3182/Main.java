package baekjoon.한동이는공부가하기싫어_3182;

import java.util.*;
import java.io.*;
public class Main {
    public static int N, cnt;
    public static int[] arr;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int senpai = Integer.MIN_VALUE;
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            visited = new boolean[N+1];
            cnt = 0;
            bfs(i);
            if (cnt > senpai) {
                senpai = cnt;
                answer = i;
            }

        }

        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        sb.append('\n');

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void bfs(int r) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(r);
        visited[r] = true;
        cnt++;

        while(!deque.isEmpty()) {
            int cur_r = deque.poll();
            int n_r = arr[cur_r];

            if (!visited[n_r]) {
                deque.offer(n_r);
                visited[n_r] = true;
                cnt++;
            }
        }
    }
}
