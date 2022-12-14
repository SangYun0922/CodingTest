package baekjoon.알바생강호_1758;

// 팁 : (각 사람이 주는 팁) - (각 사람의 등수 - 1)
// 즉 등수가 빠를 수록 팁을 많이 얻는다.
// 팁의 최댓값을 구하여라
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

        long sum = 0;
        int rank = 1;
        for (int i = arr.length-1; i >= 0; i--) {
            sum += (long) Math.max((arr[i] - (rank - 1)), 0);
            rank++;
        }

        System.out.println(sum);
    }
}
