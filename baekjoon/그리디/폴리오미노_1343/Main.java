package baekjoon.그리디.폴리오미노_1343;

import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String A = "AAAA";
        String B = "BB";
        s = s.replaceAll("XXXX", A);
        s = s.replaceAll("XX", B);
        if (s.contains("X"))
            System.out.println("-1");
        else System.out.println(s);
    }
}
