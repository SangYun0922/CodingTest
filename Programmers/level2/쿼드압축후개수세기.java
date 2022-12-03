package programmers.level2;

public class 쿼드압축후개수세기 {
    public static int one = 0;
    public static int zero = 0;

    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        backTrack(arr, 0, arr.length, 0, arr[0].length);
        answer[0] = zero;
        answer[1] = one;
        return answer;
    }

    public static void backTrack(int[][] arr, int start_X, int end_X, int start_Y, int end_Y) {
        int check = arr[start_X][start_Y];
        boolean flag = true;

        for (int i = start_X; i < end_X; i++) {
            for (int j = start_Y; j < end_Y; j++) {
                if (arr[i][j] != check) {
                    flag = false;
                    break;
                }
            }
        }

        // flag가 true라면, 해당 영역을 하나의 숫자로 친다. 그후 해당 영역은 탐색하지 않는다.
        if (flag) {
            if (check == 0)
                zero++;
            else
                one++;
            return;
        }

        // 만약 flag가 false라면, 배열의 모든 수가 같지 않은 것이므로, 4등분해서 다시 탐색한다.
        backTrack(arr, start_X, (start_X + end_X) / 2, start_Y, (start_Y + end_Y) / 2);
        backTrack(arr, start_X, (start_X + end_X) / 2, (start_Y + end_Y) / 2, end_Y);
        backTrack(arr, (start_X + end_X) / 2, end_X, start_Y, (start_Y + end_Y) / 2);
        backTrack(arr, (start_X + end_X) / 2, end_X, (start_Y + end_Y) / 2, end_Y);
    }

    public static void main(String[] args) {
        쿼드압축후개수세기 answer = new 쿼드압축후개수세기();
        int[] res = answer.solution(new int[][] {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}});
        for (int e : res)
            System.out.println(e);
    }
}
