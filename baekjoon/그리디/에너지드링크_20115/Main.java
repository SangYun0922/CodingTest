package baekjoon.에너지드링크_20115;

// 주어진 입력 배열의 2개를 고르고
// 2개중 하나의 절반을 나머지 하나와 더하자
// 이것을 반복하여 하나로 만들자, 이때 드링크의 양을 최대로 만들자 == 흘리는 양을 최소로 해보자
// 결국 하나로 합치는 것이므로 가장 큰 것을 제외한 나머지의 절반을 가장 큰 것에 더하자
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        double sum = arr[N-1];

        for (int i = 0; i < N-1; i++)
            sum += (double) arr[i] / 2;

        System.out.println(sum);
    }
}
