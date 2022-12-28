package 오셀로재배치_13413;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String s_1 = br.readLine();
            String s_2 = br.readLine();

            int cnt_B = 0;
            int cnt_W = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                if (s_1.charAt(i) != s_2.charAt(i)) {
                    if (s_1.charAt(i) == 'B')
                        cnt_B++;
                    else
                        cnt_W++;
                }
            }
            sb.append(Math.max(cnt_B, cnt_W));
            sb.append('\n');
            bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }
}
