package programmers.level1;

public class 두정수사이의합 {
    public long solution1(int a, int b) {
        long answer = 0;
        int big, small;
        if (a == (b * -1)) // 두 수의 부호가 다를때
            return 0;
        else {
            if (a > b) {
                big = a;
                small = b;
            } else {
                big = b;
                small = a;
            }
        }
        for (int i = small ; i <= big ; i++)
            answer += i;
        return answer;
    }

    public long solution2(int a, int b) {
        long answer = 0;
        long small = Math.min(a,b);
        long big = Math.max(b,a);
        answer = (big - small + 1) * (small + big) / 2;
        return answer;
    }
    public static void main(String[] args) {
        두정수사이의합 answer = new 두정수사이의합();
//        System.out.println("answer.solution1(-10000000,10000000) = " + answer.solution1(-10000000,10000000));
        System.out.println("answer.solution2(-10000000,10000000) = " + answer.solution2(-10000000,10000000));
    }
}
