package baekjoon.죽음의게임_17204;

import java.io.*;
import java.util.*;

public class Main {
    public static int N, K, answer;
    public static int[] arr;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        visited = new boolean[N];
        answer = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
//
//        for (int i = 0; i < N; i++) { //debug
//            System.out.println("arr[i] = " + arr[i]);
//        }

        boolean flag = bfs(0);

        StringBuilder sb = new StringBuilder();
        if (flag)
            sb.append(answer);
        else sb.append(-1);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static boolean bfs(int i) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(i);
        visited[i] = true;
        answer++;
        while(!deque.isEmpty()) {
            int r = deque.poll();

            int n_r = arr[r];
            if (!visited[n_r]) {
                if (n_r == K)
                    return true;
                deque.offer(n_r);
                answer++;
                visited[n_r] = true;
            }
        }
        return false;
    }

}
