package 연결요소의개수_11724;
// 인접행렬 & dfs 사용
import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[][] arr;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr  = new int[N+1][N+1];
        visited = new boolean[N+1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[r][c] = 1;
            arr[c][r] = 1;
        }

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        sb.append('\n');

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    public static void dfs(int i) {
        visited[i] = true;

        for (int j = 1; j <= N; j++) {
            if (!visited[j]&& arr[i][j] == 1) {
                dfs(j);
            }
        }
    }

}
