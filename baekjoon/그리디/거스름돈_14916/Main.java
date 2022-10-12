package baekjoon.그리디.거스름돈_14916;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int answer = 0;
        while (money % 5 != 0) {
            money -= 2;
            if (money < 0) {
                answer = -1;
                break;
            }
            answer++;
        }
        if (answer != -1)
            answer += money / 5;
        System.out.println(answer);
    }
}
