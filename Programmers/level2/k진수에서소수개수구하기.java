package programmers.level2;

public class k진수에서소수개수구하기 {
    public int solution(int n, int k) {
        String k_num;
        // 먼저 n을 k진수로 변경, 단 10진수라면 바로 String으로 변경
        // String.valueOf()를 이용해서 바꿀 수도 있다.
        // k_num = String.valueOf(n, k);
        k_num = kNum(n, k);
        System.out.println(k_num);
        String[] s = k_num.split("0");

        int answer = isPrime(s);
        return answer;
    }

    public static int isPrime(String[] s) {
        int cnt = 0;
        for (String e : s) {
            if (e.equals("") || e.equals("1")) continue;
            long tmp = Long.parseLong(e);
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(tmp); i++) {
                if (tmp % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) cnt++;
        }
        return cnt;
    }
    public static String kNum(int n, int k) { // 최대 10진수 까지이므로 알파벳변환은 필요X
        StringBuffer sb = new StringBuffer();

        while(n > 0) {
            sb.append(n % k);
            n /= k;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        k진수에서소수개수구하기 answer = new k진수에서소수개수구하기();
        System.out.println("answer.solution(\"437674\", 3) = " + answer.solution(437674, 3));
    }
}
