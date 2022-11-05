package baekjoon.구현.럭키스트레이트_18406;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int mid = N.length() / 2;
        String front = N.substring(0, mid);
        String rear = N.substring(mid);

        int tmp_1 = 0;
        int tmp_2 = 0;
        for (int i = 0; i < mid; i++) {
            tmp_1 += Integer.parseInt(front.substring(i, i+1));
            tmp_2 += Integer.parseInt(rear.substring(i, i+1));
        }

        if (tmp_1 == tmp_2)
            System.out.println("LUCKY");
        else
            System.out.println("READY");
    }
}
