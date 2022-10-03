package baekjoon.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] check = new int[10];
            int res = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
            while(res>0){
                check[res%10]++;
                res = res/10;
            }
            for (int e : check)
                System.out.println(e);

    }
}
