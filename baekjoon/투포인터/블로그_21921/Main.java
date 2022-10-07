package baekjoon.투포인터.블로그_21921;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] visitors = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N ; i++)
            visitors[i] = Integer.parseInt(st.nextToken());

        int max;
        int start = 0;
        int cnt = 0;
        int end = X - 1;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += visitors[i];
        }
        max = sum;
        cnt++;
        
        while(end < N) {
            end++;
            if (end >= N){
                break;
            }
            sum += visitors[end];
            sum -= visitors[start++];
            if (sum > max) {
                max = sum;
                cnt = 1;
            } else if (sum == max) {
                cnt++;
            }
        }
        if (max == 0) {
            System.out.print("SAD");
        } else {
            System.out.print(max + "\n" + cnt);
        }
    }
}
