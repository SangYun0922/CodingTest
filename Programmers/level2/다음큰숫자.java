package programmers.level2;

public class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        String bin = Integer.toBinaryString(n);
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1')
                cnt++;
        }

        for (int i = n+1; i <= 1000000; i++) {
            int tmp_cnt = 0;
            String tmp = Integer.toBinaryString(i);
            for (int j = 0; j < tmp.length(); j++) {
                if (tmp.charAt(j) == '1')
                    tmp_cnt++;
            }

            if (tmp_cnt == cnt) {
                answer = i;
                break;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        다음큰숫자 answer = new 다음큰숫자();
        System.out.println("answer = " + answer.solution(78));
    }
}
