package level2;

import java.util.*;

public class 주차요금계산 {
    public static int toMin(String time) { // 05:34 -> 334로 변환
        String[] time_s = time.split(":");
        int min = Integer.parseInt(time_s[0]) * 60 + Integer.parseInt(time_s[1]);
        return min;
    }

    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> map = new HashMap<>(); // Key : 자동차 번호, Value : 입차시간;
        Map<String, Integer> result = new TreeMap<>(); // Key : 자동차 번호, Value : 계산 결과 값;

        for (String x : records) {
            String[] temp = x.split(" ");
            if (temp[2].equals("IN")) {
                int min = toMin(temp[0]); // 05:34 -> 334로 변환
                if (!result.containsKey(temp[1]))
                    result.put(temp[1], 0);//처음 들어오는 차량이면(= 입차기록이 없는 차량) result에 (차량번호, 0)을 저장하도록
                map.put(temp[1], min); // (차량번호, 입차시간)
            }
            else if(temp[2].equals("OUT")) {
                int min = toMin(temp[0]);

                result.put(temp[1], result.get(temp[1]) + min - map.get(temp[1])); // (차량번호, 기존값 + 출차 시간 - 입차 시간)
                map.remove(temp[1]);
            }
        }

        // 결국 In할때 더해주고, Out할때 빼주면
        // 입차, 출차 -> 이 프로세스가 완벽하게 이루어진 차량들은 map에 없을 것!
        // 근데 map에 차가 남아있네? -> 출차 안한 것 -> 23:59에서 빼서 result에 담아주기
        if (!map.isEmpty()) {
            for (String key : map.keySet()) {
                int min  = toMin("23:59");
                result.put(key, result.get(key) + min - map.get(key));
            }
        }


        // 주차요금계산 int[] fees
        List<Integer> answer = new ArrayList<>();

        for (Integer e : result.values()) { // 두가지로 나눠야된다 1. 기본 시간 이하 2. 기본 시간 이상
            if (e <= fees[0]) answer.add(fees[1]);
            else {
                int calc = fees[1] + (int) Math.ceil(((double) (e - fees[0]) / (double) fees[2])) * fees[3];
                answer.add(calc);
            }
        }

        // System.out.println("result : " + result);
        // System.out.println("answer : " + answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        주차요금계산 answer = new 주차요금계산();
//        System.out.println("answer.solution() = " + answer.solution());
    }
}
