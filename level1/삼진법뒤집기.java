package programmers.level1;

public class 삼진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        StringBuffer temp = new StringBuffer();
        while (n != 0) {
            temp.append(n%3);
            n /= 3;
        }
        String reverse = temp.toString();
        for (int i = 0; i < reverse.length(); i++) {
            answer += Character.getNumericValue(reverse.charAt(reverse.length()-1-i)) * Math.pow(3, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        삼진법뒤집기 answer = new 삼진법뒤집기();
        System.out.println("answer. = " + answer.solution(45));
    }
}
