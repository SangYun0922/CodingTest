public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
            String answer = "";
            String encrypt = "*";
            String num = phone_number.substring(phone_number.length()-4, phone_number.length());
            answer += encrypt.repeat(phone_number.length()-4);
            // for (int i = 0; i < phone_number.length()-4 ; i++)
            //     answer += "*";
            answer += num;
            System.out.println(answer);
            return answer;
    }
    public static void main(String[] args) {
        핸드폰번호가리기 answer = new 핸드폰번호가리기();
        String phone_number = "01033334444";
        System.out.println(answer.solution(phone_number));
    }
}
