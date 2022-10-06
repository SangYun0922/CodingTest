public class 문자열다루기기본 {
    public boolean solution(String s) {
        if ((s.length() != 4 && s.length() != 6))
            return false;
        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) < 48 || (int)s.charAt(i) > 57)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        문자열다루기기본 answer = new 문자열다루기기본();
        System.out.println("answer.solution(\"1234\") = " + answer.solution("a234"));
    }
}
