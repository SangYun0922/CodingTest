package programmers.level2;

// n = i
// n = i + (i + 1)
// n = i + (i + 1) + (i + 2)
// i의 입장에서 정리해보면
// i = (n - (1부터 k-1까지의 합)) / k
// 문제에서 i는 자연수라고 하였다. 따라서, 자연수일때의 i를 구할때만 cnt를 ++해주자.

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int idx = 1;
        while ((n - sum) > 0) {
            sum += idx;
            if ((n - sum)%idx == 0) {
                answer++;
            }
            idx++;
        }
        return answer;
    }

    public static void main(String[] args) {
        숫자의표현 answer = new 숫자의표현();
        System.out.println("answer.solution(15) = " + answer.solution(15));
    }
}
