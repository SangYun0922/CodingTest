public class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i < n; i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        x만큼간격이있는n개의숫자 answer = new x만큼간격이있는n개의숫자();
        long[] solution = answer.solution(2, 5);
        for (long e : solution)
            System.out.println("e = " + e);
    }
}
