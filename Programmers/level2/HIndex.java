package programmers.level2;

import java.util.*;
public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        Arrays.sort(citations);
        int max_num = citations[n - 1];

        for (int i = max_num; i > 0; i--) {
            int cnt = 0;
            for (int e : citations) {
                if (i <= e) {
                    cnt++;
                }
            }
            if (i <= cnt) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
