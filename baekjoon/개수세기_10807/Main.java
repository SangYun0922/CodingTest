package baekjoon.개수세기_10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
//    public static int count(String[] arr, String to_find) {
//        int answer = 0;
//        for (String e : arr) {
//            if (e.equals(to_find)) {
//                answer ++;
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        String[] arr = new String[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.next();
//        }
//        String to_find = sc.next();
//        System.out.println(count(arr, to_find));
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[201];
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(N-- >0) {
            int temp = Integer.parseInt(st.nextToken());
            nums[temp+100] ++;
        }
        int to_find = Integer.parseInt(br.readLine());
        System.out.println(nums[to_find + 100]);
    }
}
