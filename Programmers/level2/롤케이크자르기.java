package level2;

// 롤케이크를 잘라서 철수와 동생이 공평한 토핑의 수를 먹게하자
// 1,2,1,3,1,4,1,2 와 같이 토핑이 올려져 있을때
// [1,2,1,3] [1,4,1,2]로 나누게 되면 각각의 토핑의 수는 똑같이 3개 이므로 공평하게 나눈 것
// 위와 같이 자를 수 있는 가짓수를 리턴하자

import java.util.*;
public class 롤케이크자르기 {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> map_1 = new HashMap<>(); // 형
        Map<Integer, Integer> map_2 = new HashMap<>(); // 동생
        
        for (int e : topping) {
            map_2.put(e, map_2.getOrDefault(e, 0) + 1);
        }
        
        for (int e : topping) {
            map_1.put(e, map_1.getOrDefault(e, 0) + 1);
            
            if (map_2.containsKey(e)) {
                if (map_2.get(e) - 1 == 0)
                    map_2.remove(e);
                else
                    map_2.put(e, map_2.get(e) - 1);  
            }
            
            if (map_1.size() == map_2.size())
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        롤케이크자르기 answer = new 롤케이크자르기();
        System.out.println("answer : " + answer.solution(new int[] {1, 2, 1, 3, 1, 4, 1, 2}));
    }
}
    