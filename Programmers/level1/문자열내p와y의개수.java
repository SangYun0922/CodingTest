package programmers.level1;

public class 문자열내p와y의개수 {
    public boolean solution(String s) {
        int tmp1 = 0, tmp2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
                tmp1++;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                tmp2++;
        }
        return tmp1 == tmp2;
    }

    public static void main(String[] args) {
        문자열내p와y의개수 answer = new 문자열내p와y의개수();

        System.out.println("answer.solution(\"Pyy\") = " + answer.solution("Pyy"));

    }
}
