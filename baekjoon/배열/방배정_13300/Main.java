package baekjoon.배열.방배정_13300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st_1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st_1.nextToken());
        int K = Integer.parseInt(st_1.nextToken());
        int answer = 0;
        int[][] check = new int[2][7];
        while(N-- > 0) {
            StringTokenizer st_2 = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st_2.nextToken());
            int grade = Integer.parseInt(st_2.nextToken());
            check[gender][grade] ++;
        }

        for (int i =0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                answer += check[i][j] / K;
                    if (check[i][j] % K != 0)
                        answer++;
            }
        }
        System.out.println(answer);
    }
}
