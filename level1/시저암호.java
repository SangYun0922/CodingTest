public class 시저암호 {
    public String solution(String s, int n) {
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ')
                continue;
            else if ((Character.isUpperCase(str[i]) && ((int) str[i] + n > 90)) || (Character.isLowerCase(str[i]) && ((int) str[i] + n > 122))){
                str[i] = (char) ((int) str[i] + n - 26);
            }
            else {
                str[i] = (char) ((int) str[i] + n );
            }
        }
        return new String(str);
    }
    public static void main(String[] args) {
        시저암호 answer = new 시저암호();
        System.out.println("(int)'a' = " + (int)'a');
        System.out.println("answer.solution(\"AB\",1) = " + answer.solution("AB",25));
    }
}
