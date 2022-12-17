package baekjoon.잃어버린괄호_1541;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        int answer = Integer.MAX_VALUE;
        String[] s = exp.split("-");


        for (String e : s) {
            String[] temp = e.split("\\+");
            int sum = 0;
            for (String f : temp)
                sum += Integer.parseInt(f);

            if (answer == Integer.MAX_VALUE)
                answer = sum;
            else
                answer -= sum;
        }

        System.out.println(answer);
    }
}
