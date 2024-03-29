package baekjoon.회의실배정_1931;

// 종료시간을 기준으로 오름차순 정렬, 종료시간이 같다면, 시작시간을 기준으로 오름차순 정렬
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });

//        for (int i = 0; i < N; i++) {
//            System.out.println(arr[i][0] + " " + arr[i][1]);
//        }

        int cnt = 1;
        int prev_end = arr[0][1];
        for (int i = 1; i < N; i++) {
            if (prev_end <= arr[i][0]) {
                prev_end = arr[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
