package programmers.level2;

// n = 진법, t = 미리 구할 숫자의 개수, m = 게임에 참가하는 인원, p = 튜브의 순서
// n = 2, t = 4, m = 2, p = 1 일 경우,
// 0 1 1 0 1 1 1 0 0 .... 으로 간다.
// 이때, 미리 구할 숫자의 개수가 4개이므로, 튜브가 말해야 하는 수는 0 1 1 1 이 된다.
// 이때, 각각은 (1, 3, 5, 7)번째에 말한 수 이다.

public class N진수게임 {
    public String solution(int n, int t, int m, int p) {
        StringBuffer answer = new StringBuffer();
        StringBuffer sb = new StringBuffer();
        int num = 0;
        
        // 먼저 m번째 인원이 t번 말하는 지점까지 구한다
        while (sb.length() < m * t) {
            sb.append(Integer.toString(num++, n));
        }

        // answer에 튜브의 순번에 맞는 수를 넣는다.
        int idx = p - 1;
        while(answer.length() < t) {
            answer.append(sb.substring(idx, idx+1).toUpperCase());
            idx += m;
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        N진수게임 answer = new N진수게임();
        System.out.println("answer.solution(2,4,2,1) = " + answer.solution(2,4,2,1));
    }
}
