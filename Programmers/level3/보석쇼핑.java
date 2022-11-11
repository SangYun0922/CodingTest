package programmers.level3;
import java.util.*;
public class 보석쇼핑 {
    public int[] solution(String[] gems) {
        int[] answer = new int[] {1, gems.length};
        int max_num = Integer.MAX_VALUE;
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        for (String e : gems) {
            set.add(e);
        }

        int start = 0;
        int end = 0;

        int x = 0;
        int y = 0;
        while(end < gems.length) {
            map.put(gems[end], map.getOrDefault(gems[end], 0) + 1);
            end++;

            if (map.size() == set.size()) {
                while(start < end) {
                    if (map.get(gems[start]) <= 1)
                        break;
                    map.put(gems[start], map.get(gems[start]) - 1);
                    start++;
                }

                if (end - start < max_num) {
                    max_num = end - start;
                    answer[0] = start+1;
                    answer[1] = end;
                }
            }
        }


        return answer;
    }
    
    public static void main(String[] args) {
        보석쇼핑 answer = new 보석쇼핑();
        System.out.println("answer.solution(new String[] {\"XYZ\", \"XYZ\", \"XYZ\"}) = " + answer.solution(new String[] {"XYZ", "XYZ", "XYZ"}));
    }
}
