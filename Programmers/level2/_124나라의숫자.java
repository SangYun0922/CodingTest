package programmers.level2;

public class _124나라의숫자 {
    public static String[] nums = {"4","1","2"};
    public String solution(int n) {
        String answer = "";
        answer = toKnum(n);
        return answer;
    }

    public static String toKnum(int n) {
        StringBuffer sb = new StringBuffer();

        while(n > 0) {
            int y = n % 3;
            n /= 3;

            if (y == 0)
                n--;

            sb.append(nums[y]);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        _124나라의숫자 answer = new _124나라의숫자();
        System.out.println("answer.so = " + answer.solution(40));
    }
}
