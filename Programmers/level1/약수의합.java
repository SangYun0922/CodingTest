public class 약수의합 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= ((int) Math.sqrt((double) n)) ; i++) {
            if (n % i == 0)
                if (i * i == n)
                    answer += i;
                else
                    answer += (i + n/i);
        }
        return answer;
    }
    
    public static void main(String[] args) {
        약수의합 answer = new 약수의합();
        System.out.println("answer.solution(12) = " + answer.solution(25));
    }
}
