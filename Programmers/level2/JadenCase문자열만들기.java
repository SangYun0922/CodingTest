package programmers.level2;

public class JadenCase문자열만들기 {
    public String solution(String s) {
        String answer = "";
        String[] word_list = s.toLowerCase().split("");
        Boolean flag = true;
        for (String e : word_list) {
            answer += flag ? e.toUpperCase() : e;
            flag = e.equals(" ");
        }
        return answer;
    }

    public static void main(String[] args) {
        JadenCase문자열만들기 answer = new JadenCase문자열만들기();
        System.out.println("answer.solution(\"3people unFollowed me\") = " + answer.solution("3people unFollowed me"));
    }
}
