package programmers.level2;

public class 이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = {};
        int cnt = 0;
        int to_Del = 0;
        while (!s.equals("1")) {
            String ss = s.replace("0","");
            to_Del += s.length() - ss.length();
            s = Integer.toBinaryString(ss.length());
            cnt++;
        }
        return new int[]{cnt, to_Del};
    }

    public static void main(String[] args) {
        이진변환반복하기 answer = new 이진변환반복하기();
        int[] res = answer.solution("110010101001");
        for (int e : res)
            System.out.println("e = " + e);
    }
}
