package baekjoon.strfry_11328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int[] check = new int[26];
            StringTokenizer st = new StringTokenizer(br.readLine());
            String origin = st.nextToken();
            String strfry = st.nextToken();
            int len = origin.length();
            if (len != strfry.length())
                System.out.println("Impossible");
            else {
                for (int i = 0; i < len; i++)
                    check[origin.charAt(i) - 'a'] ++;
                for (int i = 0; i < len; i++)
                    check[strfry.charAt(i) - 'a'] --;
                Boolean isPossible = true;
                for (int e : check) {
                    if (e != 0)
                        isPossible = false;
                }
                if (isPossible) System.out.println("Possible");
                else System.out.println("Impossible");
            }
        }
    }
}
