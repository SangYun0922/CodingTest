package baekjoon.호반우상인의이상한품질계산법_20117;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 호반우를 묶음으로 팔 때는 모든 호반우의 품질을 묶음의 중앙값으로 결정한다.
// 2 4 8 9 10 11
// 2 3 4 5 10  / 8 9 11
// 묶음 안의 개수가 1개일때, 1+1/2 = 1 -> 가장 마지막 수
// 묶음 안의 개수가 2개일때, 2/2 + 1 = 2 -> 가장 마지막 수
// 묶음 안의 개수가 3개일때, (3+1) / 2 = 2
// 묶음 안의 개수가 5개일때, (5+1) /2 == 3
// 묶음 안의 개수가 6개일때, 6/2 + 1 = 4
// 묶음 안의 개수가 7개일때, (7+1) /2 = 4
// 묶음 안의 개수가 8개일때, 8/2 + 1 = 5
// 묶음 안의 개수가 9개일때, (9+1) / 2 = 5
// 묶음 안의 개수가 10개일때, 10/2 + 1 = 6
// 즉, 2개씩 묶을때 최대가 된다. 왜? 2개씩 묶게 되면 결국 중앙값이 마지막 값이 되기 때문이다.
// 가장 큰 값과 가장 작은값 총 2개를 묶음으로 나타내면 결국 품질계산은 가장 큰값으로 모두 계산
// 따라서, 2개씩 묶으며 더해주다가 길이가 홀수가 되어 1개가 남는다면 마지막에 그 값을 더해준다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st =  new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 2 4 8 9
        int sum = Arrays.stream(arr).sum();
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        int quotient = arr.length / 2;
        int idx = arr.length-1;
        while(quotient-- > 0) {
            answer += arr[idx] * 2;
            idx--;
        }
        if (arr.length % 2 == 1 ) {
            answer += arr[idx];
        }
        sb.append(Math.max(answer, sum));
        sb.append('\n');
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
