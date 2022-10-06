package baekjoon.배열.방번호_1475;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String room_num = br.readLine();
        int[] numbers = new int[10];
        for (int i = 0; i < room_num.length(); i++) {
            if (room_num.charAt(i) == '6'){
                if (numbers[6] > numbers[9])
                    numbers[9]++;
                else numbers[6]++;
            } else if (room_num.charAt(i) == '9') {
                if (numbers[9] > numbers[6])
                    numbers[6]++;
                else numbers[9]++;
            }
            else
                numbers[Character.getNumericValue(room_num.charAt(i))]++;
        }
        System.out.println(Arrays.stream(numbers).max().getAsInt());
    }
}
