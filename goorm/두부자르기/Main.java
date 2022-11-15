package goorm.두부자르기;

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        // 6 1  -> 1썰기
        // 3 3 1 -> 2썰기
        // 2 2 2 1 -> 3썰기
        // 1 1 1 1 1 1 1 -> 7썰기

        // N -1의 약수의 개수를 찾자
        int cnt = 0;
        for (int i = 1; i < Math.sqrt(N-1); i++) {
            if (((N - 1) % i) == 0)
                cnt += 2;
        }

        System.out.println(cnt);
    }
}
