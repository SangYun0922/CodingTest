package level2;

import java.util.*;
public class 교점에별만들기 {
    public String[] solution(int[][] line) {
        String[] answer;
        List<long[]> list = new ArrayList<>();
        long max_X = Long.MIN_VALUE;
        long min_X = Long.MAX_VALUE;
        long max_Y = Long.MIN_VALUE;
        long min_Y = Long.MAX_VALUE;

        for (int i = 0; i < line.length; i++) {
            long a = line[i][0];
            long b = line[i][1];
            long e = line[i][2];
            for (int j = i; j < line.length; j++) {
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];

                long up_x = b*f - e*d;
                long up_y = e*c - a*f;
                long down = a*d - b*c;

                if (down != 0) {
                    double x = (double) up_x / down;
                    double y = (double) up_y / down;

                    if ((x == Math.ceil(x)) && (y == Math.ceil(y))) {
                        list.add(new long[] {(long) x, (long) y});
                        max_X = Math.max((long) x, max_X);
                        min_X = Math.min((long) x, min_X);
                        max_Y = Math.max((long) y, max_Y);
                        min_Y = Math.min((long) y, min_Y);
                    }
                }
            }
        }

        boolean[][] map = new boolean[(int) (max_Y - min_Y + 1)][(int) (max_X - min_X + 1)];
        answer = new String[map.length];

        for (long[] e : list) {
            int x = (int) (e[0] - min_X) ;
            int y = (int) (e[1] - max_Y) ;

            map[Math.abs(y)][x] = true;
        }

        int idx = 0;
        for (boolean[] bs : map) {
            StringBuffer sb = new StringBuffer();
            for (boolean b : bs) {
                if (b)
                    sb.append("*");
                else
                    sb.append(".");
            }
            answer[idx] = sb.toString();
            idx++;
        }
        return answer;
    }

    public static void main(String[] args) {
        교점에별만들기 answer = new 교점에별만들기();
        System.out.println("answer.solution(new int[][] {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}}) = " + answer.solution(new int[][] {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}}));
    }
}
