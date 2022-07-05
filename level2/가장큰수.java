package level2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public String solution(int[] numbers) {

        String answer = "";
        String[] str_nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            str_nums[i] = String.valueOf(numbers[i]);
        Arrays.sort(str_nums, new Comparator<String>() { //이거 왜이렇게 된거지..? 공부 필요!
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2); ////두 수를 번갈아가며 합친 수 중 큰 값을 앞으로 정렬(내림차순 정렬)
                //compareTo 공부 필요!
            }
        });
        for (String e : str_nums)
            answer += e;
        if(str_nums[0].equals("0")) answer = "0";
        return answer;
    }

    public static void main(String[] args) {
        가장큰수 answer = new 가장큰수();
        int[] numbers = {6,10,2};
        System.out.println("answer.solution(numbers) = " + answer.solution(numbers));
    }
}
