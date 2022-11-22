package programmers.level2;

import java.util.*;
public class 프렌즈4블록 {
    public static String[][] map;
    public static int answer;
    public int solution(int m, int n, String[] board) {
        answer = 0;

        map = new String[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = board[i].substring(j, j+1);
            }
        }

        // 지워질 블록이 있을때 까지 반복
        while(downBlocks(m, n));
        return answer;
    }

    // 지워질 블록이 있는가 체크, 있다면 내림
    public static boolean downBlocks(int m , int n) {
        boolean[][] chk = new boolean[m][n];
        for (int i = 0; i < m - 1; i++) {
            for (int j =0; j < n - 1; j++) {
                if (map[i][j].equals("0")) continue;
                if (check(i, j) == true) {
                    chk[i][j] = true;
                    chk[i+1][j] = true;
                    chk[i][j+1] = true;
                    chk[i+1][j+1] = true;
                }
            }
        }

        int cnt = 0;
        // chk가 true라면, 블록이 깨진것 따라서, 위의 블록이 있다면 아래로 내려야한다.
        for (int j = 0; j < n; j++) {
            List<String> list = new ArrayList<>();
            for (int i = m-1; i >= 0; i--) {
                if (chk[i][j] == true) {
                    cnt++;
                    continue;
                }
                list.add(map[i][j]);
            }

            for (int i = m-1, k = 0; i >= 0; i--, k++) {
                if (k < list.size()) map[i][j] = list.get(k);
                else map[i][j] = "0";
            }
        }
        answer += cnt;
        if (cnt == 0) return false;
        else return true;
    }

    // 4방향 체크
    public static boolean check(int r, int c) {
        String s = map[r][c];

        if (map[r+1][c].equals(s) && map[r][c+1].equals(s) && map[r+1][c+1].equals(s))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        프렌즈4블록 answer = new 프렌즈4블록();
//        System.out.println("answer.solution() = " + answer.solution());
    }
}
