package baekjoon.주유소_13305;

// N개의 도시가 존재, 도시들은 수평 일직선도로에 위치
// 자동차로 제일 왼쪽에있는 도시에서 출발하여 제일 오른쪽에 위치한 도시로 이동하려고 한다.
// 각 도시 사이의 간격은 서로 다른 km이다.
// 처음에 기름을 채워야 한다. & 1km 이동하는데에 1리터가 소요된다.
// 각 도시에서 기름을 채울 수 있다. 도착할때까지 필요한 최소기름 가격을 출력하자.
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] distance = new int[N - 1];
        int[] cities = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cities[i] = Integer.parseInt(st.nextToken());
        }

        long cost = 0; // 두번째 도시까지 가야하므로 기본적으로
        int min_city = Integer.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
            if (cities[i] < min_city)
                min_city = cities[i];

            cost += (long) min_city * distance[i];
        }

        System.out.println(cost);
    }
}
