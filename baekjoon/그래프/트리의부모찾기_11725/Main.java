package 트리의부모찾기_11725;
// 루트노드인 1의 부모를 0이라고 설정
// 그후 dfs로 탐색하면서, 특정 노드에 도달할때마다 부모노드를 업데이트
// 인접행렬 -> 메모리 초과, 따라서, 인접 리스트로 구현필수
import java.io.*;
import java.util.*;
public class Main {
    public static int N;
    public static List<List<Integer>> adj;
    public static int[] check;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>();
        check = new int[N+1];
        visited = new boolean[N+1];

        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            adj.get(r).add(c);
            adj.get(c).add(r);
        }

        dfs(1, 0);

        for (int i = 2; i <= N; i++)
        {
            System.out.println(check[i]);
        }
    }
    public static void dfs(int i, int prev) {
        visited[i] = true;
        check[i] = prev;

        for (int j = 0; j < adj.get(i).size(); j++) {
            int child = adj.get(i).get(j);
            if (!visited[child]) {
                dfs(child, i);
            }
        }
    }
}
