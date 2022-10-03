package baekjoon.배열.알파벳개수_10808;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

// 브루트 포스 풀이
//        for (char token= 'a' ; token <= 'z'; token++) {
//            int cnt = 0;
//            for (int i = 0; i < s.length(); i++) {
//                if (token == s.charAt(i))
//                    cnt++;
//            }
//            System.out.print(cnt + " ");
//        }
//        System.out.println();

// 최적화 풀이
        int[] freq = new int[26];
        char[] char_list = s.toCharArray();
        for (char e : char_list) {
            freq[e-'a'] ++;
        }
        for (int i = 0 ; i < 26; i++)
            System.out.print(freq[i] + " ");
    }
}