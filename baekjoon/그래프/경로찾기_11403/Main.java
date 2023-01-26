package 경로찾기_11403;

import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[][] arr, answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        answer = new int[N][N];

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++)
            bfs2(i);


        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void bfs2(int start) {
        boolean[] visited = new boolean[N];
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(start);

        while(!deque.isEmpty())
        {
            int cur = deque.poll();

            for (int i = 0; i < N; i++) {
                if (arr[cur][i] == 1 && !visited[i]) { // 방문하지 않은 곳만 탐색해야됨 // 0 -> 1 -> 0 -> 1 과 같은 현상 방지
                    deque.offer(i); // (cur -> i) 경로발견
                    visited[i] = true;
                    answer[start][i] = 1; // cur는 start에서 시작한 것이므로 결국 cur -> i 는 start -> cur -> i 이므로 start -> i 로 볼 수 있다.
                }
            }
        }
    }

}
