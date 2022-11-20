package baekjoon.투포인터.좋다_1253;


// 먼저 타겟넘버를 하나 정하고 그 숫자가 두 수의 합으로 표현되는지 알아보아야 한다.
// 이떄, 정렬이 필요 -> 왜?
// 타겟넘버가 두 수의 합으로 표현된다면 정답 갱신 (정답 +1)
// 유사문제 : 세용액_2473
import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (func(i)) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean func(int target_idx) {
        int L = 0; int R = arr.length - 1;
        while(L < R) {
            if (L == target_idx) L++; // 같은 수는 피해야 하므로, 같은 수를 만났다면 L을 이동
            else if (R == target_idx) R--; // 같은 수는 피해야 하므로, 같은 수를 만났다면 R을 이동
            else {
                int sum = arr[L] + arr[R];
                if (sum == arr[target_idx]) return true; // 타겟이랑 합이 같다면 탈출
                else if (sum < arr[target_idx]) L++; // 합보다 작다면 L 포인터를 오른쪽으로 움직인다.
                else R--; // 합보다 크다면 R 포인터를 왼쪽으로 움직인다.
            }
        }
        return false;
    }
}
