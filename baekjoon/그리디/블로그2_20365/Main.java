package 블로그2_20365;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        List<String> cnt_B = new ArrayList<>();
        List<String> cnt_R = new ArrayList<>();
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        StringTokenizer st_1 = new StringTokenizer(s, "B");
        while(st_1.hasMoreTokens()) {
            cnt_B.add(st_1.nextToken());
        }

        StringTokenizer st_2 = new StringTokenizer(s, "R");
        while(st_2.hasMoreTokens()) {
            cnt_R.add(st_2.nextToken());
        }


        answer = Math.min(cnt_B.size(), cnt_R.size()) + 1;
        sb.append(answer);
        sb.append('\n');
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
