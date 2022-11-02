package programmers.level2;

public class 행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int columns = arr2[0].length;
        int[][] answer = new int[rows][columns];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        행렬의곱셈 answer = new 행렬의곱셈();
//        System.out.println("answer.solution() = " + answer.solution());
    }
}
