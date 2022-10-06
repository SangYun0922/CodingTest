public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++)
            answer += absolutes[i]*(signs[i] ?1:-1);
        return answer;
    }

    public static void main(String[] args){
        int absolutes[] = {4,7,12};
        boolean signs[] = {true, false, true};
        음양더하기 answer = new 음양더하기();
        System.out.println("solution(absolutes, signs) = " + answer.solution(absolutes, signs));
    }
}
