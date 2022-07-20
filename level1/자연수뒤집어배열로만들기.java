import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String num = new StringBuilder(String.valueOf(n)).reverse().toString();
        int[] answer = new int[num.length()];
        for (int i = 0; i < num.length(); i++)
            answer[i] = Integer.valueOf(Character.toString(num.charAt(i)));
        return answer;
    }
    public static void main(String[] args) {
        자연수뒤집어배열로만들기 answer = new 자연수뒤집어배열로만들기();
        long n = 12345;
        System.out.println("answer.solution(n) = " + answer.solution(n));
    }
}
