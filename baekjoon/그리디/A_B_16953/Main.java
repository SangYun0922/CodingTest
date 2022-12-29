package baekjoon.A_B_16953;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int cnt = 0;
        while(B > A) {
            if (B % 2 == 0) {
                B /= 2;
                cnt++;
            } else if (B % 10 == 1){
                B /= 10;
                cnt++;
            } else {
                break;
            }
        }

        if (B == A)
            System.out.println(cnt+1);
        else
            System.out.println(-1);
    }
}
