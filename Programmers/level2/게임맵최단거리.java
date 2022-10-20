package programmers.level2;

import java.util.*;
public class 게임맵최단거리 {
    static int[] dr = {0, 0, 1, -1}; //동서남북
    static int[] dc = {1, -1, 0, 0}; //동서남북

    public void dfs (int[][] maps, int[][] visited) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[]{0,0});

        while(!deque.isEmpty()) {
            int[] cur = deque.poll();
            int cur_r = cur[0];
            int cur_c = cur[1];

            for (int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];

                if (nr >= 0 && nc >= 0 && nr < maps.length && nc < maps[0].length) {
                    if (maps[nr][nc] == 1 && visited[nr][nc] == 0) {
                        visited[nr][nc] = visited[cur_r][cur_c] + 1;
                        deque.add(new int[]{nr, nc});
                    }
                }
            }
        }
    }
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        visited[0][0] = 1;

        dfs(maps, visited);
        answer =  visited[maps.length -1][maps[0].length - 1] == 0 ? -1 : visited[maps.length-1][maps[0].length - 1];

        return answer;
    }
    
    public static void main(String[] args) {
        게임맵최단거리 answer =  new 게임맵최단거리();
        System.out.println("answer.solution() = " + answer.solution(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}));
    }
}
