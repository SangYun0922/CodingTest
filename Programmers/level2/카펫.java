package programmers.level2;

public class 카펫 {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];
            int sum = brown + yellow;
            int x, y;
            for (int i = 3; i <= Math.sqrt(sum); i++) {
                if ( sum % i == 0) {
                    x = Math.max(i, sum/i);
                    y = Math.min(i, sum/i);

                    if ((x - 2) * (y - 2) == yellow) {
                        answer[0] = x;
                        answer[1] = y;
                    }
                }
            }
            return answer;
        }

    public static void main(String[] args) {
        카펫 answer = new 카펫();
        System.out.println("answer.solution(10, 2) = " + answer.solution(10, 2));
    }
}
