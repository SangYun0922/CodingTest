package 특정거리의도시찾기_18352;

import java.io.*;
import java.util.*;

// 인접행렬 구현 시 메모리초과, 인접 리스트로 구현
// 단, 이번에는 방향성이 있는 그래프이다.
public class Main {
    public static int N, K;
    public static List<List<Integer>> adj;
    public static int[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        adj = new ArrayList<>();
        check = new int[N+1];

        for (int i = 0; i <= N; i++) {
            check[i] = 300001;
        }
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            adj.get(r).add(c);
        }

//        dfs(X, 0);
        bfs(X);

        boolean flag = false;
        for (int i = 0; i <= N; i++) {
            if (check[i] == K) {
                System.out.println(i);
                flag = true;
            }

        }

        if (!flag)
            System.out.println(-1);
    }

    public static void bfs(int X) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(X);
        check[X] = 0;

        while(!deque.isEmpty()) {
            int cur_r = deque.pop();

            for (int i = 0; i < adj.get(cur_r).size(); i++) {
                if (check[adj.get(cur_r).get(i)] == 300001) { // 가장 먼저 도착하는 경우가 최단거리이기 때문에 초기값으로 도착하는 값을 선정
                    deque.offer(adj.get(cur_r).get(i));
                    check[adj.get(cur_r).get(i)] = check[cur_r] + 1;
                }
            }
        }
    }
//    public static void dfs(int X, int distance) { // 메모리 초과
//        check[X] = Math.min(check[X], distance);
//        for (int i = 0; i < adj.get(X).size(); i++)
//        {
//            int temp = adj.get(X).get(i);
//            dfs(temp, distance+1);
//        }
//    }
}
