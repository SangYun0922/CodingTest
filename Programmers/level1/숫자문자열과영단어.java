package programmers.level1;
import java.util.*;
public class 숫자문자열과영단어 {
    public int solution(String s) {
        String[] list = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0 ; i < 10; i++) {
            s= s.replace(list[i], String.valueOf(i));
        }
        return Integer.valueOf(s);
    }

    public static void main(String[] args) {
        숫자문자열과영단어 answer = new 숫자문자열과영단어();
        System.out.println("answer.solution(\"one4seveneight\") = " + answer.solution("one4seveneight"));
    }
}
