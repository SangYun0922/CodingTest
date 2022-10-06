import java.util.*;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        if (arr.length <= 1)
                return new int[] {-1};
        return Arrays.stream(arr).filter(e -> e!= Arrays.stream(arr).min().getAsInt()).toArray(); //자바 stream관련 포스팅 작성 필요
    }
    public static void main(String[] args) {
        제일작은수제거하기 answer = new 제일작은수제거하기();
        System.out.println("answer.solution(new int[] {4,3,2,1}) = " + answer.solution(new int[] {4,3,2,1}));
    }
}
