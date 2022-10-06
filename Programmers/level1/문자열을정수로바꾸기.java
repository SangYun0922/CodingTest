public class 문자열을정수로바꾸기 {
    public int solution(String s) {
        if (s.charAt(0) == '-')
            return -Integer.valueOf(s.substring(1,s.length()));
        else if (s.charAt(0) == '+')
                return Integer.valueOf(s.substring(1,s.length()));
        return Integer.valueOf(s);
    }
    public static void main(String[] args) {
        문자열을정수로바꾸기 answer = new 문자열을정수로바꾸기();
        System.out.println("answer.solution(\"-1234\") = " + answer.solution("-1234"));
    }
}
