package programmers.level2;
// 한 번에 K칸 점프 or 현재까지 온 거리 * 2 만큼 순간이동
// 점프하면 K칸 점프한 만큼 배터리 소모, 순간이동은 배터리 소모 없음
// N만큼 떨어진 장소로 이동하려고 한다. 이때 건전지 사용량을 최소로 해서 가자
// 즉, 점프를 최소로 해서 가보자
// 그리디 문제, 동전 개수 문제랑 동일
public class 점프와순간이동 {
    public int solution(int n) {
        int ans = 0;
        while(n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        점프와순간이동 answer = new 점프와순간이동();
        System.out.println("answer.solution(5000) = " + answer.solution(5000));
    }
}
