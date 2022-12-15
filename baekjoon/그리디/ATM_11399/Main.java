package baekjoon.ATM_11399;

import java.io.*;
import java.util.*;

// ATM앞에 N명의 사람들이 줄을 서 있다. 각 사람이 돈을 인출하는데에 걸리는 시간이 존재한다.
// 각 사람이 인출하는데 필요한 시간의 합의 최솟값을 구하여라
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//        int[] arr = new int[N];
        int[][] arr = new int[N][2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = i + 1;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int sum = 0;
        for (int i = 0; i < N; i++) {
            int temp = 0;
            for (int j = 0; j <= i; j++) {
                temp += arr[j][0];
            }
            sum += temp;
        }

        System.out.println(sum);
    }
}
