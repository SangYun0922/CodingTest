package baekjoon.문어_21313;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N-1; i++) {
            if (i % 2 == 0)
                sb.append(1 + " ");
            else
                sb.append(2 + " ");
        }

        if (N % 2 == 0)
            sb.append(2);
        else
            sb.append(3);

        bw.write(sb.toString() + '\n');
        bw.flush();
        bw.close();
    }
}
