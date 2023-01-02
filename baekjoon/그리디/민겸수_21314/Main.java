package baekjoon.민겸수_21314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(getMax(s));
        System.out.println(getMin(s));
    }
    public static String getMax(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') {
                int idx = i;
                while( idx < s.length() && s.charAt(idx) == 'M') {
                    idx++;
                }

                if (idx == s.length()) {
                    for (; i < idx; i++)
                        sb.append(1);
                } else {
                    sb.append(5);
                    for (; i < idx; i++)
                        sb.append(0);
                }
                i = idx;
            } else {
                sb.append(5);
            }
        }
        return sb.toString();
    }
    public static String getMin(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') {
                int idx = i;
                while( idx < s.length() && s.charAt(idx) == 'M') {
                    idx++;
                }
                sb.append(1);
                for (;i+1 < idx; i++)
                    sb.append(0);
                i = idx - 1;
            } else {
                sb.append(5);
            }
        }
        return sb.toString();
    }
}
