package baekjoon.뒤집기_1439;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        StringTokenizer st_1 = new StringTokenizer(s, "1");
        StringTokenizer st_0 = new StringTokenizer(s, "0");

        System.out.println(Math.min(st_1.countTokens(), st_0.countTokens()));

    }
}
