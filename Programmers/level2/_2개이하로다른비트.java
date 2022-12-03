package programmers.level2;

public class _2개이하로다른비트 {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            String s = "0" + Long.toString(numbers[i], 2);

            StringBuffer sb = new StringBuffer();

            int idx = s.length() - 1;
            for (; idx >= 0; idx--) {
                char c = s.charAt(idx);
                if (c == '0') {
                    sb.append('1');
                    break;
                }
                else
                    sb.append(c);
            }

            sb.reverse();
            sb.insert(0, s.substring(0, idx));
            if (idx != s.length() - 1) {
                sb.replace(idx + 1, idx + 2, "0");
            }

            answer[i] = Long.parseLong(sb.toString(), 2);
        }
        return answer;
    }

    public static void main(String[] args) {
        _2개이하로다른비트 answer = new _2개이하로다른비트();
        System.out.println("answer.solution(new long[] {3,7}) = " + answer.solution(new long[] {3,7}));
    }
}
