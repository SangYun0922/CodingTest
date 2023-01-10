package baekjoon.내선물을받아줘2_15886;

// blog
// 직접 그림으로 그려보면 편하다
// E E W W E W 라고 해보자
// E : -> , W : <- 이므로
// -> -> <- <- -> <- 로 표현 가능하다.
// 인덱스 기준으로 0에서 시작하든, 3에서 시작하든 결국 1에서 만나게 된다.
// 즉, 화살표 촉끼리 만나는 지점은 서로 이어진 하나의 길이라고 볼 수 있다. (길모퉁이를 생각해보자.)
// 결국 우리는 이러한 길 모퉁이만 세어주면 된다.
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int answer = 0;
        for (int i = 0; i < N-1; i++) {
            if (s.charAt(i) == 'E' && s.charAt(i+1) == 'W')
                answer++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        sb.append('\n');
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
