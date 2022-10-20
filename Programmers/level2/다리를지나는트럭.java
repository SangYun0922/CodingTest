package programmers.level2;

import java.util.*;
public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        int sum = 0;
        for (int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];
            while(true) {
                if(deque.isEmpty()) {
                    deque.add(truck);
                    sum+=truck;
                    answer++;
                    break;
                } else if (deque.size() == bridge_length) {
                    sum -= deque.poll();
                } else {
                    if (sum + truck <= weight) {
                        deque.add(truck);
                        sum += truck;
                        answer++;
                        break;
                    } else{
                        deque.add(0);
                        answer++;
                    }
                }
            }
        }
        return answer + bridge_length;
    }
    public static void main(String[] args) {
        다리를지나는트럭 answer = new 다리를지나는트럭();
        System.out.println("answer.solution(2,10,new int[] {7,4,5,6}) = " + answer.solution(2,10,new int[] {7,4,5,6}));
    }
}
