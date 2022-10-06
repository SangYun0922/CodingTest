package programmers.level1;

public class 콜라츠추측 {
    public int solution (int num) {
        int answer = 0;
        long long_num = num;
        while(long_num != 1) {
            if (long_num % 2 == 0)
                long_num = long_num/2;
            else
                long_num = long_num*3 + 1;
            answer++;
            if (answer > 500)
                return -1;
        }
        return answer;
    }
    public static void main(String[] args) {
        콜라츠추측 answer = new 콜라츠추측();
        System.out.println("answer = " + answer.solution(626331));
    }
}
