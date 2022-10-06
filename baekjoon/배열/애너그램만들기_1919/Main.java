package baekjoon.배열.애너그램만들기_1919;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String str_1 = br.readLine();
        String str_2 = br.readLine();
        int[] freq = new int[26];
        
        for (int i = 0; i < str_1.length(); i++) {
            freq[str_1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str_2.length(); i++) {
            freq[(str_2.charAt(i) - 'a')]--;
        }

        for (int e : freq)
            answer += Math.abs(e);
        System.out.println(answer);
    }
}
