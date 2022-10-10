public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int[] e : sizes) {
            int temp_max = Math.max(e[0], e[1]);
            int temp_min = Math.min(e[0], e[1]);

            if (temp_max > max)
                max = temp_max;
            if (temp_min > min)
                min = temp_min;
        }
        return max * min;
    }

    public static void main(String[] args) {
        최소직사각형 answer = new 최소직사각형();
        System.out.println("answer.solution() = " + answer.solution(new int[][] {{60,50}, {30,70}, {60,30}, {80,40}}));
    }
}
