package baekjoon.그리디.소수사이수열_3896;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[1299710];
        for (int i = 2; i <= 1299709; i++) {
            for (int j = i; i * j > 2 && i * j <= 1299709; j++) {
                prime[i*j] = true;
            }
        }

        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if (prime[N]) {
                int x = N;
                int y = N;
                while(--x > 2)
                    if (!prime[x]) break;
                while(++y > 2)
                    if (!prime[y]) break;

                System.out.println(y - x);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
