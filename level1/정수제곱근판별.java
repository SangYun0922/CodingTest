package programmers.level1;

public class 정수제곱근판별 {
    public long solution(long n) {
        if( Math.sqrt(n) - (int) Math.sqrt(n) == 0) {
            long tmp = (int) Math.sqrt(n) + 1;
            return (long) Math.pow(tmp, 2);
        } else
            return -1;
    }

    public static void main(String[] args) {
        정수제곱근판별 answer = new 정수제곱근판별();
        System.out.println("answer = " + answer.solution(111));
    }
}
