package 촌수계산_2644;

import java.io.*;
import java.util.*;

public class Main {
    public static int N, A, B, answer;
    public static List<List<Integer>> adj;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        answer = -1;
        int M = Integer.parseInt(br.readLine());

        adj = new ArrayList<>();
        visited = new boolean[N+1];
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0 ; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj.get(y).add(x); // x가 y의 부모이다.
            adj.get(x).add(y); // x가 y의 부모이다.
        }
        dfs(A, 0);

        System.out.println(answer);
    }

    public static void dfs(int X, int distance) {
        if (X == B) {
            answer = distance;
        }
        visited[X] = true;

        for (int i = 0; i < adj.get(X).size(); i++) {
            int temp = adj.get(X).get(i);

            if (!visited[temp]) {
                dfs(temp, distance + 1);
            }
        }
    }
}
