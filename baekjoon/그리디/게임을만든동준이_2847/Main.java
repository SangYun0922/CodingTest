package 게임을만든동준이_2847;

// 총 N개의 레벨 존재
// 각 레벨을 클리어할 때 마다 점수가 주어진다.
// 점수를 기준으로 온라인 순위를 매긴다. 이때, 실수로 쉬운레벨이 어려운 레벨보다 점수를 많이 받는 경우를 만들었다.
// 특정 레벨의 점수를 감소시켜 각 레벨을 클리어할 때 주는 점수를 증가시키도록 한다.
// 몇번 감소시키면 되는지 리턴해라
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        int point = arr[N-1];
        int ans = 0;
        for (int i = N-1; i >= 0; i--) {
            int sub = point - arr[i];
            if (sub > 0) {
                point = arr[i] - 1;
            } else {
                ans += Math.abs(point - arr[i]);
                point--;
            }
        }

        sb.append(ans);
        sb.append('\n');
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
