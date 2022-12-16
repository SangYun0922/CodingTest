package baekjoon._21세일_11508;

// 10, 9, 4, 2, 6, 4, 3
// 10 9 6  4 4 3   2 => 10 + 9 + 4 + 4 + 2 = 29원
// 6 4 5 5 5 5
// 6 5 5  5 5 4 => 6 + 5 + 5 + 5 = 21
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int cnt = 0;
        int sum = 0;
        for (int i = N-1; i >= 0; i--) {
            if (cnt == 2) {
                cnt = 0;
            } else {
                sum += arr[i];
                cnt++;
            }

        }
        System.out.println(sum);
    }
}
