package baekjoon.로프_2217;
// N개의 로프가 존재, 로프를 이용하여 여러가지 물체를 들어올릴 수 있다.
// 각각의 로프는 굵기나 길이가 서로 다르다.
// 여러개의 로프를 병렬로 연결하면 각각의 로프에 걸리는 중량을 나눌 수 있다.
// 즉, k개의 로프를 사용하여 w 무게의 물체를 들어올릴때, 각각의 로프에는 모두 고르게 w/k만큼의 중량이 걸린다.
// 여러개의 로프들에 대한 정보가 주어졌을때, 이 로프들을 이용하여 들어올릴 수 있는 최대 중량을 구하자
// 모든 로프를 사용할 필요없이 임의로 몇개의 로프를 골라서 사용가능하다.
// N = 3, 로프는 10, 40, 40 이라고 해보자
// 이떄, 최대 중량은 40 + 40 인 80이다.
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 오름차순 정렬
        int max_num = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] * (N - i) > max_num)
                max_num = arr[i] * (N - i);
        }

        System.out.println(max_num);
    }
}
