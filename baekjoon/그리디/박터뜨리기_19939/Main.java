package baekjoon.박터뜨리기_19939;

// N개의 공을 K개의 바구니에 나눠 담자
// 바구니에 담기는 공의 개수를 모두 다르게 하자
// 이때 각 바구니에는 1개 이상의 공이 무조건 있어야 한다.
// 가장 많이 담긴 바구니와 가장 적게 담긴 바구니의 공의 개수 차이를 최소화 하자
// 나눠 담을 수 있으면 공의 개수 차이를 출력, 그렇지 않은 경우에는 -1 출력
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= K; i++) {
            N -= i;
        }

        StringBuffer sb = new StringBuffer();
        if (N < 0) {
            sb.append(-1);
        } else {
            if (N % K > 0)
                sb.append(K);
            else
                sb.append(K-1);
        }

        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
