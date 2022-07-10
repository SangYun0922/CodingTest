package programmers.level1;

import java.util.Arrays;

public class 평균구하기 {
    public double solution(int[] arr) {
        double answer = (double) Arrays.stream(arr).sum() / arr.length; //타입캐스팅 필요!
        return answer;
    }

    public static void main(String[] args) {
        평균구하기 answer = new 평균구하기();
        int[] arr = {1,2,3,4};
        System.out.println(answer.solution(arr));
    }
}
