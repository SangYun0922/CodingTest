package baekjoon.알파벳개수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (char token= 'a' ; token <= 'z'; token++) {
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (token == s.charAt(i))
                    cnt++;
            }
            System.out.print(cnt + " ");
        }
        System.out.println();
    }
}