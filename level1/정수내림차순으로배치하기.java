import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        String num = String.valueOf(n);
        char[] arr = num.toCharArray();
        Arrays.sort(arr);
        long answer = Long.parseLong(new StringBuilder(new String(arr)).reverse().toString());
        return answer;
    }

    public static void main(String[] args) {
        정수내림차순으로배치하기 answer = new 정수내림차순으로배치하기();
        long n = 118372;
        System.out.println(" = " + answer.solution(n));
    }
}
