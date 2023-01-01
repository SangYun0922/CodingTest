package baekjoon.나무자르기_14247;

// 성장기대치가 낮은 나무부터 잘라버린다.
// 성장기대치가 큰 나무들은 나중에 잘라버리는것이 이득이기 때문이다.
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] growth = new int[N];
        long answer = 0L;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            answer += Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            growth[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(growth);

        for (int i = 1; i < N; i++) {
            answer += (long) i * growth[i];
        }

        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        sb.append('\n');

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
