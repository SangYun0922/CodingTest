public class 두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a<=b){
            for(int i= a ; i<=b; i++){
                answer += i;
            }
        } else {
            for(int i= b; i<=a; i++){
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        두정수사이의합 answer = new 두정수사이의합();
        System.out.println("answer.solution(3,5) = " + answer.solution(3,5));
    }
}
