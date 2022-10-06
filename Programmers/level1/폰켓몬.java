import java.util.*;
public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length/2;
        Set<Integer> set = new HashSet<Integer>();
        for (int i : nums)
            set.add(i);
        answer = (set.size() > count) ? count : set.size();
        return answer;
    }

    public static void main(String[] args) {
        폰켓몬 answer = new 폰켓몬();
        int[] nums = {3,1,2,3};
        System.out.println("answer.solution(nums) = " + answer.solution(nums));
    }
}
