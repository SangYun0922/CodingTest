package baekjoon.동전0_11047;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;
        while(!pq.isEmpty()) {
            if (K == 0)
                break;
            int coin = pq.poll();
            if (K / coin != 0) {
                cnt += K/coin;
                K -= coin * (K / coin);
            }
        }

        bw.write(String.valueOf(cnt) + '\n');
        bw.flush();
        bw.close();
    }
}
