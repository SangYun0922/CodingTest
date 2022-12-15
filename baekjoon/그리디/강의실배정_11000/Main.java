package baekjoon.강의실배정_11000;

// 가장 먼저 시작하는 것 선택
// 가장 먼저 시작하는 것이 여러개이면 가장 빨리 끝나는 것 선택
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(arr[0][1]);

        for (int i = 1; i < N; i++) {
            if (pq.peek() <= arr[i][0])
                pq.poll();

            pq.offer(arr[i][1]);

//            System.out.println(arr[i][0] + " " + arr[i][1]);
//            System.out.println(pq);
        }
        System.out.println(pq.size());
    }
}
