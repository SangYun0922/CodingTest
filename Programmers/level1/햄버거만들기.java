import java.util.*;
public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int e : ingredient) {
            stack.push(e);

            if (stack.size() >= 4) {
                if (
                        (stack.get(stack.size() - 1) == 1) &&
                                (stack.get(stack.size() - 2) == 3) &&
                                (stack.get(stack.size() - 3) == 2) &&
                                (stack.get(stack.size() - 4) == 1)
                ) {
                    answer++;
                    for (int i = 0; i < 4; i++)
                        stack.pop();
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        햄버거만들기 answer = new 햄버거만들기();
        System.out.println("answer.solution(new int[] {2,1,1,2,3,1,2,3,1}) = " + answer.solution(new int[] {2,1,1,2,3,1,2,3,1}));
    }
}
