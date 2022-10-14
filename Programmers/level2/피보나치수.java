package line;

public class 피보나치수 {
    static int[] data = new int[100001];

    public int solution(int n) {
        int answer = fibonacci(n);
        return answer;
    }

    public static int fibonacci(int n) {
        if (n < 2)
            return n;
        if(data[n] != 0) return data[n] % 1234567; // n번째 피보나치 수 / 1234567 값 return

        return data[n] = (fibonacci(n - 1) + fibonacci(n - 2)) % 1234567;
    }
    public static void main(String[] args) {
        피보나치수 answer = new 피보나치수();
        System.out.println("answer.solution(3) = " + answer.solution(3));
    }
}
