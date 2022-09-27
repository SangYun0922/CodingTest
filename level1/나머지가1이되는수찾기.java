package programmers.level1;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = 9999999;
        for (int i = 1; i < n ; i++) {
            if (n % i == 1 && i < answer) {
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        나머지가1이되는수찾기 answer = new 나머지가1이되는수찾기();
        System.out.println("solution = " + answer.solution(12));
    }
}
