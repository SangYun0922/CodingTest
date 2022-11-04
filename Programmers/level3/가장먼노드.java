package level3;

import java.util.*;
public class 가장먼노드 {    // public static int[][] map; // 인접행렬
    public static List<List<Integer>> nodes = new ArrayList<>();
    public static boolean[] visited;
    public static int[] distance;
    public static int N;

    public int solution(int n, int[][] edge) {
        int answer = 0;
        N = n;
        // map = new int[N+1][N+1]; // 인접행렬
        visited = new boolean[N+1];
        distance = new int[N+1];

        for (int i = 0; i <= N; i++) { // 인접 리스트
            nodes.add(new ArrayList<Integer>());
        }

        // for (int[] e : edge) { // 인접행렬
        //     map[e[0]][e[1]] = 1;
        //     map[e[1]][e[0]] = 1;
        // }

        for (int[] e : edge) { // 인접 리스트
            nodes.get(e[0]).add(e[1]);
            nodes.get(e[1]).add(e[0]);
        }

        bfs();

        int max_num = Arrays.stream(distance).max().getAsInt();
        for(int i = 0; i <= N; i++) {
            if (distance[i] == max_num)
                answer++;
        }
        return answer;
    }

    public static void bfs() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        visited[1] = true;

        while(!deque.isEmpty()) {
            int x = deque.poll();

            for (int i = 0; i <= N; i++) { // 인접리스트
                if (!visited[i] && nodes.get(x).contains(i)) {
                    visited[i] = true;
                    distance[i]  = distance[x] + 1;
                    deque.offer(i);
                }
            }
            // for (int i = 0; i <= N; i++) { // 인접행렬
            //     if (!visited[i] && map[x][i] == 1) {
            //         visited[i] = true;
            //         distance[i] = distance[x] + 1;
            //         deque.offer(i);
            //     }
            // }
        }
    }

    //// stackoverflow ////
//     public static void dfs(int x) {
//         visited[x] = true;

//         for (int i = 0; i <= N; i++) {
//             if (!visited[i] && map[x][i] == 1) {
//                 distance[i] = distance[x] + 1;
//                 dfs(x);
//             }
//         }
//     }

    public static void main(String[] args) {
        가장먼노드 answer = new 가장먼노드();
    }
}
