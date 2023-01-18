package 결혼식_5567;

// 친구의 친구까지 초대
import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static List<List<Integer>> adj;
    public static Set<Integer> friends;
    public static int[] check;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        adj = new ArrayList<>();
        friends = new HashSet<>();
        visited = new boolean[N+1];
        check = new int[N+1];

        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj.get(y).add(x);
            adj.get(x).add(y);
        }


        bfs(1);

        int answer = 0;
        for (int i = 0; i <= N; i++) {
            System.out.print(check[i] + " ");
            if (check[i] <= 2 && check[i] > 0)
                answer++;
        }
        System.out.println();
        System.out.println(answer);
    }

    public static void bfs(int X) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(X);
        check[X] = 0;
        while(!deque.isEmpty()) {
            int cur_r = deque.poll();

            for (int i = 0; i < adj.get(cur_r).size(); i++) {
                int temp = adj.get(cur_r).get(i);
                if (!visited[temp]) {
                    check[temp] = check[cur_r] + 1;
                    friends.add(temp);
                    deque.offer(temp);
                    visited[cur_r] = true;
                }
            }
        }
    }
}
