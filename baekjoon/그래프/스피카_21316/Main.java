package baekjoon.스피카_21316;

// 스피카의 특징 : 스피카로 연결되는 3개의 점 각각은 모두 3, 1, 2의 연결선을 가지고 있다.
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] map = new int[13][13];

        for (int i = 1; i <= 12; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n_1 = Integer.parseInt(st.nextToken());
            int n_2 = Integer.parseInt(st.nextToken());

            map[n_1][n_2]++;
            map[n_2][n_1]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 13; i++) {
            int sum = Arrays.stream(map[i]).sum();

            if (sum != 3)
                continue;

            int connection = 0;
            for (int j = 1; j < 13; j++) {
                if (map[i][j] == 1)
                    connection += Arrays.stream(map[j]).sum();
            }

            if (connection == 6)
                sb.append(i);
        }
        sb.append('\n');

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
