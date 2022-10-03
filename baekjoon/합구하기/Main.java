package baekjoon.합구하기;

import java.util.*;
/* *
문제
주어진 길이 N의 INT배열 arr에서 합이 100인 서로 다른 위치의 원소가 존재하면 1, 존재하지 않으면 0을 리턴하는 함수를 작성하여라
* */
public class Main {
    public int func2(int arr[], int N) {
        int[] temp = new int[101];
        for (int e : arr) {
            if (temp[100-e] == 1) {
                return 1;
            } else {
                temp[e] = 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Main answer = new Main();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num_list = new int[size];
        for (int i = 0; i < size; i++) {
            num_list[i] = sc.nextInt();
        }

        System.out.println(answer.func2(num_list, size));
    }
}
