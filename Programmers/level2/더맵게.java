package programmers.level2;

import java.util.*;
public class 더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int e : scoville)
            heap.offer(e);

        while(heap.peek() < K) {
            if (heap.size() == 1)
                return -1;
            int x = heap.poll();
            int y = heap.poll();

            heap.offer(x + (y * 2));
            answer++;
        }
        if (answer == 0)
            return -1;
        return answer;
    }

    public static void main(String[] args) {
        더맵게 answer = new 더맵게();
//        System.out.println("answer.solution() = " + answer.solution());
    }
}
