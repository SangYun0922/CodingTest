package baekjoon.ByteCoin_17521;

// 예시 : W : 24, n : 5 7 5 4 2 7 8 5 3 4
// 오름차순 구간, 내림차순 구간으로 나누자
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long w = Integer.parseInt(st.nextToken());
        long coin = 0;
        int[] chart = new int[n];

        for(int i=0; i<n; i++) {
            chart[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<n-1; i++) {
            if(chart[i] < chart[i+1]) {//다음날 올랐어
                if(w>=chart[i]) {
                    coin += w/chart[i];
                    w %= chart[i];
                }
            }else if(chart[i]> chart[i+1]) {//떨어짐
                w += coin * chart[i];
                coin = 0;
            }
        }
        w += coin * chart[n-1];
        System.out.println(w);
    }
}
