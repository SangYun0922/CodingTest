package programmers.level1;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = 0;
        for (int i = 0; i < String.valueOf(x).length(); i++)
            tmp += String.valueOf(x).charAt(i) - '0';
        answer = x % tmp == 0;
        return answer;
    }

    public static void main(String[] args) {
        하샤드수 answer= new 하샤드수();
        System.out.println("answer.solution() = " + answer.solution(16));
    }
}
