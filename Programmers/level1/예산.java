import java.util.*;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int temp = 0;
        d = Arrays.stream(d).sorted().toArray();
        for (int e : d) {
            temp += e;
            if (budget < temp)
                break;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        예산 answer = new 예산();
        System.out.println("answer = " + answer.solution(new int[]{1,3,2,5,4}, 9));
    }
}
