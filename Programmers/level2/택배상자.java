package level2;

// 택배상자의 크기는 모두 같다. 1번부터 n번까지 번호가 증가하는 순서대로 벨트에 놓자
// 벨트는 한방향으로만 진행이 가능하여 벨트에 놓인 순서대로 상자를 내릴 수 있다.
// 그러나 벨트에 놓인 순서대로 택배상자를 바로 트럭에 싣게 되면 배달 순서와 맞지 않아 문제발생
// 특정한 순서에 맞게 트럭에 택배상자를 싣자.
// 이때, 순서에 맞지 않는 상자는 보조컨테이너벨트에 놓자. 이 벨트는 스택구조로 형성되어있다.
// 최대 몇개의 상자를 실을 수 있는지 리턴.
// 만약 순서가 4,3,1,2,5라고 예시를 들어보자.
// 이때, 메인 컨테이너 벨트에는 1,2,3,4,5순서대로 박스가 놓여져 있을 것이다.
// 먼저, 4번 박스부터 실어야 하므로, 보조 컨테이너 벨트에는 1,2,3 박스가 역순으로 저장되어 있게 된다.
// 그 후 3번 박스를 실어야 하므로 보조 컨테이너 벨트에서 3번 박스를 가져와서 싣는다.
// 그 후 1번 박스를 실어야 하는데 보조 컨테이너 벨트의 입구에는 2번 박스가 있고, 메인 컨테이너 벨트에는 5번 박스가 있으므로 박스를 실을 수 없다.
// 따라서, 최대 4,3번 박스를 실을 수 있으므로 2 리턴.
import java.util.*;
public class 택배상자 {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> sub_container = new Stack<>(); // 보조 컨테이너 벨트

        int container_box = 1; // 현재 메인 컨테이너 벨트에 있는 박스
        for (int e : order) {
            while(container_box <= order.length) { // 현재 순서에 맞는 택배상자가 올때까지 보조 컨테이너 벨트에 저장
                if (container_box == e) { // 메인 컨테이너 벨트에 순서에 맞는 택배상자가 있다면
                    break; // 반복문 탈출
                } else if (!sub_container.isEmpty() && sub_container.peek() == e) { // 보조 컨테이너 벨트에 순서에 맞는 택배상자가 있다면
                    break; // 반복문 탈출
                } else { // 둘 다 없다면, 상자가 있을때까지 보조 컨테이너 벨트에 저장하며 탐색해야 한다.
                    sub_container.push(container_box); // 보조 컨테이너 벨트에 저장
                    container_box++; // 1 증가시켜 다음 메인 컨테이너 상자
                }
            }
            
            // 스택에 다 저장을 했음 && 탐색 시작
            if (container_box == e) { // 만약 컨테이너 벨트에서 순서에 맞는 택배상자가 있다면
                container_box++; // 메인 컨테이너 벨트에서 하나 꺼내고
                answer++; // 정답 증가
            } else if (!sub_container.isEmpty() && sub_container.peek() == e) { // 만약 보조 컨테이너 벨트에서 순서에 맞는 택배상자가 있다면
                sub_container.pop(); // 보조 컨테이너 벨트에서 하나 꺼내고
                answer++; // 정답 증가
            } else { // 둘다 없다면 실을 수 없으므로 종료
                break;
            }
        
        }
        return answer;
    }

    public static void main(String[] args) {
        택배상자 answer = new 택배상자();
        System.out.println("answer : " + answer.solution(new int[] {4,3,1,2,5}));
    }
}
