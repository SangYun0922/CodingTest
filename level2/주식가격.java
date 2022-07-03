package level2;

public class 주식가격{
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; //0으로 초기화
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] >= prices[i])
                    answer[i]++;
                else {
                    answer[i]++;
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        주식가격 answer = new 주식가격();
        int[] prices = {1,2,3,2,3};
        int[] result = answer.solution(prices);
        for (int e : result)
            System.out.println("e = " + e);
    }
}
