package programmers.level1;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i))
                answer -= i;
            else
                answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        약수의개수와덧셈 answer = new 약수의개수와덧셈();
        System.out.println("answer.solution(13, 17) = " + answer.solution(13, 17));
    }
}
