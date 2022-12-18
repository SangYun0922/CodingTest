package baekjoon.사탕_11256;

// 크기가 다른 상자 N개를 가지고 있다. j개의 사탕을 가게에 보내기 위해 상자에 포장해야 한다.
// 박스를 다 채울 필요는 없음
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken()); // 사탕의 개수
            int N = Integer.parseInt(st.nextToken()); // 상자의 개수
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i] = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int answer = 0;
            for (int i = N - 1; i >= 0; i--) {
                if (j == 0)
                    break;
                answer++;
                j = Math.max(0, j - arr[i]);
            }

            System.out.println(answer);
        }
    }
}
