package 특정거리의도시찾기_18352;

import java.io.*;
import java.util.*;

// 인접행렬 구현 시 메모리초과, 인접 리스트로 구현
// 단, 이번에는 방향성이 있는 그래프이다.
public class Main {
    public static int N, K;
    public static List<List<Integer>> adj;
    public static List<Integer> answer;
    public static int[] check;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        adj = new ArrayList<>();
        answer = new ArrayList<>();
        check = new int[N+1];
        visited = new boolean[N+1];

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

        System.out.println(adj);
        dfs(X, 0);

        for (int i = 0; i <= N; i++) {
            System.out.println("check[i] = " + check[i]);
            if (check[i] == K)
                answer.add(i);
        }


        if (answer.isEmpty())
            System.out.println(-1);
        else {
            Collections.sort(answer);
            System.out.println(answer);
        }
    }

    public static void dfs(int X, int distance) {
        visited[X] = true;
        check[X] = Math.min(check[X], distance);
        System.out.println("X : " + X + " check[x] : " + check[X]);
        for (int i = 0; i < adj.get(X).size(); i++)
        {
            int temp = adj.get(X).get(i);
            if(!visited[temp]) {
                System.out.println("temp : " + temp + " distance : " + distance);
                dfs(temp, distance+1);
            }

        }
    }
}
