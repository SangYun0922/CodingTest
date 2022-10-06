public class 이상한문자만들기 {
    public String solution(String s) {
        char[] sequences = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < sequences.length; i++) {
            if (sequences[i] == ' ') {
                cnt = 0;
                continue;
            }
            if (cnt % 2 == 0  )
                sequences[i] = Character.toUpperCase(sequences[i]);
            else
                sequences[i] = Character.toLowerCase(sequences[i]);
            cnt++;
        }
        return new String(sequences);
    }
    public static void main(String[] args) {
        이상한문자만들기 answer = new 이상한문자만들기();
        String s = "try hello world";
        System.out.println("answer.solution(new String(\"try hello world\")) = " + answer.solution(s));
    }
}
