package baekjoon.비트우정지수_12782;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String num_1 = st.nextToken();
            String num_2 = st.nextToken();

            int cnt_0 = 0;
            int cnt_1 = 0;
            for (int i = 0; i < num_1.length(); i++) {
                if (num_1.charAt(i) != num_2.charAt(i)) {
                    if (num_1.charAt(i) == '1')
                        cnt_1++;
                    else
                        cnt_0++;
                }
            }
            System.out.println(Math.max(cnt_1, cnt_0));
        }
    }
}
