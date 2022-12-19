package baekjoon.짐챙기는숌_1817;

// 책이 탑처럼 쌓여있다. 이것을 차례대로 박스에 넣자
// 각각에 책에는 무게가 있고, 박스에는 최대 넣을 수 있는 무게가 있다.
// 필요한 박스의 개수의 최솟값을 구하자
// 책은 쪼개기 불가하다.
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 책의 개수
        int M = Integer.parseInt(st.nextToken()); // 박스에 넣을 수 있는 최대무개

        if (N == 0) {
            bw.write("0\n");
            bw.flush();
            bw.close();
        } else {
            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int size= M;
            int answer = 1;
            for(int i = 0; i < N; i++) {
                if (arr[i] > size) {
                    size = M - arr[i];
                    answer++;
                } else {
                    size -= arr[i];
                }
            }

            bw.write(String.valueOf(answer) + '\n');
            bw.flush();
            bw.close();
        }
    }
}
