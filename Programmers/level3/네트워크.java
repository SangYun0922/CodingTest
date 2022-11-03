package programmers.level3;

import java.util.*;
public class 네트워크 {
    public static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs (i, computers);
                answer++;
            }
        }
        return answer;
    }

    public void bfs(int node, int[][] computers) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(node);
        visited[node] = true;

        while(!deque.isEmpty()) {
            int x = deque.poll();

            for (int i = 0; i < computers[x].length; i++) {
                if (!visited[i] && i != x && computers[x][i] == 1) {
                    visited[i] = true;
                    deque.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        네트워크 answer = new 네트워크();
//        System.out.println("answer.solution() = " + answer.solution());
    }
}
