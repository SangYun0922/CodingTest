package level2;
import java.util.*;
public class 영어끝말잇기 {

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        char w = ' ';
        int i = 0;
        List<String> dict = new ArrayList<>();
        boolean flag = true;
        for (; i < words.length; i++) {

            if (dict.contains(words[i])) {
                flag = false;
                break;
            }
            if (i == 0) {
                w = words[i].charAt(words[i].length() - 1);
            } else {
                if (words[i].charAt(0) == w) {
                    w = words[i].charAt(words[i].length() - 1);
                } else {
                    flag = false;
                    break;
                }
            }
            dict.add(words[i]);
        }

        if (flag) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = i % n + 1;
            answer[1] = i / n + 1;
        }
        // System.out.println(i);
        // System.out.println(dict);
        return answer;
    }

    public static void main(String[] args) {
        영어끝말잇기 answer = new 영어끝말잇기();
        System.out.println("answer = " + answer.solution(3, 	new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
    }
}
