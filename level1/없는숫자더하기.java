//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Collectors;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> nums = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        List<Integer> origin_num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        for (int e : origin_num) {
            if (!nums.contains(e)) {
                answer += e;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        없는숫자더하기 answer = new 없는숫자더하기();
        System.out.println("answer.solution(new int[]{1,2,3,4,6,7,8,0}) = " + answer.solution(new int[]{1,2,3,4,6,7,8,0}));
    }
}
