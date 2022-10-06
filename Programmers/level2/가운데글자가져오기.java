package programmers.level1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        return s.length() % 2 == 0 ? s.substring(s.length()/2 -1 , s.length()/2+1) : s.substring(s.length()/2,s.length()/2+1);
    }
    
    public static void main(String[] args) {
        가운데글자가져오기 answer = new 가운데글자가져오기();
        System.out.println("answer.solution(\"abcde\") = " + answer.solution("abcd"));
    }
}
