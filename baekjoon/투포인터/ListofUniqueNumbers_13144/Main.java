package baekjoon.투포인터.ListofUniqueNumbers_13144;


// 5
// 1 2 3 1 2
// idx = 0의 경우 (1) (1,2) (1,2,3) 가능
// idx = 1의 경우 (2) (2,3) (2,3,1) 가능
// idx = 2의 경우 (3) (3,1) (3,1,2) 가능
// idx = 3의 경우 (1) (1,2) 가능
// idx = 4의 경우 (2) 가능
// 총 12개의 경우의 수
// 즉 오른쪽 포인터를 이동하다, 기존에 포함되어있던 수를 만나면 스탑
// 그 다음 왼쪽 포인터를 이동
// 가장 최악의 경우 총 50억번 반복해야되는 경우의 수가 발생
// 반복문안에서 list를 만들게 되면 메모리 초과
// 따라서, check배열을 선언
// cnt는 L과 R사이의 간격이다.
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int R = 0; long cnt = 0; int[] check = new int[100001];
        for (int L = 0; L < N; L++) {
            if (L != 0)
                check[arr[L-1]] = 0;

            while (R < N && check[arr[R]] != 1) {
                if (check[arr[R]] == 1)
                    break;
                check[arr[R]]++;
                R++;
            }
            cnt+= R - L;
        }
        System.out.println(cnt);
    }
}
