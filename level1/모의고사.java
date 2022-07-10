package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public int[] solution(int[] answers) {
        List<Integer> ans = new ArrayList<>();
        int[] answer = {};
        int[] tmp = new int[3];
        int[] math_hater1 = {1, 2, 3, 4, 5};
        int[] math_hater2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] math_hater3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (math_hater1[i % math_hater1.length] == answers[i]) tmp[0]++;
            if (math_hater2[i % math_hater2.length] == answers[i]) tmp[1]++;
            if (math_hater3[i % math_hater3.length] == answers[i]) tmp[2]++;
        }

        int max_cnt = Math.max(Math.max(tmp[0], tmp[1]), tmp[2]);
        for (int i = 0 ; i < tmp.length ; i++)
            if (max_cnt == tmp[i])
                ans.add(i+1);
        answer = ans.stream().mapToInt(i->i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        모의고사 solution = new 모의고사();
        int[] arr = {1,2,3,4,5};
        System.out.println("result = " + solution.solution(arr));

    }
}
