package baekjoon.밑줄_1474;

import java.io.*;
import java.util.StringTokenizer;

// N개의 영어단어를 이용해 길이가 M인 새로운 단어를 만들자
// N개의 단어를 순서대로 이어붙이고 각 단어 사이에 _를 넣어서 만들자
// 위와 같이 했는데 길이가 M이 안된다면 _를 더 추가하자
// 단, 되도록이면 _의 개수는 모두 같아야 하고, 만약 불가능할 경우에는 최대개수와 최소개수의 차이가 1만큼 나도록 하자
// email : skwx50000@gmail.com
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        int empty = N - 1; // 단어사이의 공백개수
        int len = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            arr[i] = s;
            len += s.length();
        }

        int cnt = M - len; // 필요한 밑줄의 개수
        int lines = cnt / empty; // 사이에 들어갈 밑줄의 개수
        int ex_lines = cnt % empty; // 추가로 남는 밑줄의 개수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N-1; i++) {
            char tmp = arr[i+1].charAt(0);
            sb.append(arr[i]);
            for (int j = 0; j < lines; j++)
                sb.append("_");
            if (ex_lines > 0 && Character.isLowerCase(tmp) || ex_lines == empty - i ){ // 핵심코드,
                // 원래 기본적으로 대문자로만 이루어져있을때는 뒤에서 부터 남는 _를 붙인다.
                // 그러나 대문자 소문자가 섞여있을때는, 중간에 남는 _를 소비하게 된다.
                // 중간에 남는 _를 소비하게 된다해도, 결국 _가 남아있다면 뒤에서 부터 _를 붙인다.
                // ex_lines > 0 && Character.isLowerCase(tmp) 가 소문자일때 _를 붙이게 하고
                // ex_lines == empty-i가 뒤에서 부터 _를 붙이는 역할을 한다.
//                System.out.println(i + " : "+ arr[i] + " hit! " + ex_lines);
                sb.append("_");
                ex_lines--;
            }
        }
        sb.append(arr[arr.length-1]);
        sb.append('\n');
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
