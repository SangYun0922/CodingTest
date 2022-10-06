public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        char[] num = String.valueOf(n).toCharArray();
        for (int e : num)
           answer += e - 48;
        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 answer = new 자릿수더하기();
        System.out.println("answer.solution(123) = " + answer.solution(123));
    }
}
