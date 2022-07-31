public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder();
        answer.append("김서방은 ");
        for (int i = 0; i <seoul.length; i++) {
            if (seoul[i].equals("Kim"))
                answer.append(i);
        }
        answer.append("에있다");
        return answer.toString();
    }
    public static void main(String[] args) {
        서울에서김서방찾기 answer = new 서울에서김서방찾기();
        System.out.println("answer.solution(new String[]{\"Jane\", \"Kim\"}) = " + answer.solution(new String[]{"Jane", "Kim"}));
    }
}
