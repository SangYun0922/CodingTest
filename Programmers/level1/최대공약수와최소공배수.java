import java.math.BigInteger;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        BigInteger a = BigInteger.valueOf(n);
        BigInteger b = BigInteger.valueOf(m);
        int gcd = a.gcd(b).intValue();
        answer[0] = gcd;
        int lcm = (n * m ) / gcd;
        answer[1] = lcm;
        return answer;
    }

    public static void main(String[] args) {
        최대공약수와최소공배수 answer = new 최대공약수와최소공배수();
        int n = 3, m = 12;
        System.out.println("answer.solution(n, m) = " + answer.solution(n, m));
    }
}
