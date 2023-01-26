package 효율적인해킹_1325;

// A가 B를 신뢰한다 == B를 해킹하면 A도 해킹가능하다.
// 즉 방향이 있는 그래프.
// N은 최대 10000이므로 인접행렬로 표현하기에 메모리 초과 발생
// 방문체크 필수 -> 방문체크를 하지 않은 경우 1 -> 3 -> 5 -> 1 과 같은 순환 구조 발생가능
// 방문하지 않은 노드에 대해서만 해킹개수 카운트

import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int max_num = Integer.MIN_VALUE ;
    public static List<List<Integer>> adj;
    public static int[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        adj = new ArrayList<>();
        check = new int[N+1];
        for (int i = 0; i <= N; i++)
            adj.add(new ArrayList<Integer>());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj.get(y).add(x);
        }

        for (int i = 1; i <= N; i++) {
            bfs(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (check[i] == max_num)
                sb.append(i + " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void bfs(int x) {
        boolean[] visited = new boolean[N+1];
        int cnt = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(x);
        visited[x] = true;

        while(!deque.isEmpty()) {
            int cur = deque.poll();

            for (int i : adj.get(cur)) {
                if (!visited[i]) {
                    deque.offer(i);
                    visited[i] = true;
                    cnt++;

                }
            }
        }

        check[x] = cnt;
        max_num = Math.max(max_num, cnt);
    }
}
