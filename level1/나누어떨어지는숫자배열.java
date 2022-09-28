package programmers.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> res = new ArrayList<>();
        for (int e : arr) {
            if ( e % divisor == 0)
                res.add(e);
        }
        if (res.isEmpty())
            return new int[]{-1};
        else {
            return res.stream().sorted(Comparator.naturalOrder()).mapToInt(Integer::intValue).toArray();
        }
    }

    public static void main(String[] args) {
        나누어떨어지는숫자배열 answer = new 나누어떨어지는숫자배열();
        int[] res = answer.solution(new int[]{5,9,7,10}, 5);
        for (int e : res)
            System.out.println("e = " + e);
    }
}
