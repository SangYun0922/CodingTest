package programmers.level1;

public class 삼진법뒤집기 {
    public int solution1(int n) { //기존 풀이
        int answer = 0;
        StringBuffer temp = new StringBuffer();
        while (n != 0) {
            temp.append(n%3);
            n /= 3;
        }
        String reverse = temp.toString();
        System.out.println("reverse = " + reverse);
        for (int i = 0; i < reverse.length(); i++) {
            answer += Character.getNumericValue(reverse.charAt(reverse.length()-1-i)) * Math.pow(3, i);
        }
        return answer;
    }

    public int solution2(int n) { //최적화 풀이
        StringBuffer temp = new StringBuffer();
        while (n > 0) {
            temp.append(n%3);
            n /= 3;
        }
        return Integer.parseInt(temp.toString(), 3);
    }

    public static void main(String[] args) {
        삼진법뒤집기 answer = new 삼진법뒤집기();
        System.out.println("answer. = " + answer.solution1(45));
        System.out.println("answer. = " + answer.solution2(45));
    }
}
