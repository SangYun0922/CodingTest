package 가희와3단고음_16162;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (arr[i] == A) {
                answer++;
                A += D;
            }
        }
        sb.append(answer);
        sb.append('\n');
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
