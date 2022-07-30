package programmers.level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        StringBuilder answer = new StringBuilder(new String (str));
        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        문자열내림차순으로배치하기 answer = new 문자열내림차순으로배치하기();
        System.out.println("answer.solution(s) = " + answer.solution("Zbcdefg"));
    }
}
