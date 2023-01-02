package baekjoon.행복유치원_13164;

// N명의 원생들을 키 순서대로 줄 세우고, 총 K개의 조로 나눈다.
// 각 조에는 원생이 적어도 한 명 있어야 한다.
// 나누어진 조들은 각자 단체 티셔츠를 맞추고자 한다. 비용은 조에서 가장 키가 큰 원생과 작은 원생의 키 차이만큼 든다.
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        List<Integer> diff_arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N-1; i++) {
            diff_arr.add(arr[i+1] - arr[i]);
        }
        Collections.sort(diff_arr);
        int answer = 0;
        for (int i = 0; i < N-K; i++)
            answer += diff_arr.get(i);
        System.out.println(answer);
    }
}
