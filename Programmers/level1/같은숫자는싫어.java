import java.util.ArrayList;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        int value = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != value) {
                result.add(arr[i]);
                value = arr[i];
            }

        answer = result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
    public static void main(String[] args) {
        같은숫자는싫어 answer = new 같은숫자는싫어();
        int[] arr = {1,1,3,3,0,1,1};
        int[] result = answer.solution(arr);
        for (Integer e : result)
            System.out.println("e = " + e);
    }
}
