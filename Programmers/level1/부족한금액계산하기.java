package programmers.level1;


public class 부족한금액계산하기 {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }

    public static void main(String[] args) {
        부족한금액계산하기 answer = new 부족한금액계산하기();
        System.out.println("answer.so = " + answer.solution(2500,10000,4));
    }
}
