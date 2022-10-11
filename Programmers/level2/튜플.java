package programmers.level2;

import java.util.*;

public class 튜플 {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        s = s.replace("{{", "");
        s = s.replace("}}", "");
        s = s.replace("},{", "/");
        String[] str = s.split("/");
        Arrays.sort(str, (String e1, String e2) -> e1.length() - e2.length());

        for (int i = 0; i < str.length; i++) {
            String[] temp = str[i].split(",");
            for (int j = 0; j < temp.length; j++) {
                int n = Integer.parseInt(temp[j]);
                if (!answer.contains(n))
                    answer.add(n);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main (String[] args) {
        튜플 answer = new 튜플();
        System.out.println("answer.solution(\"{{2},{2,1},{2,1,3},{2,1,3,4}}\") = " + answer.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
    }
}
