package programmers.level1;
import java.util.*;
public class 크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] == 0) {
                    continue;
                } else {
                    if (board[j][moves[i] - 1] == deque.getFirst()) {
                        deque.removeFirst();
                        answer += 2;
                    } else {
                        deque.addFirst(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        크레인인형뽑기게임 answer = new 크레인인형뽑기게임();
        System.out.println("answer.solution() = " +
                answer.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}},
                        new int[] {1,5,3,5,1,2,1,4}));
    }
}
