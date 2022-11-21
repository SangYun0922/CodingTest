package programmers.level2;

// HashMap, ArrayList, Switch문 적극 이용
// user라는 맵에 uid를 key로 nickname을 value로 저장
// action이라는 ArrayList에 {log, uid}라는 String[]을 시간 순서대로 저장
// 정답결과는 action의 원소를 하나씩 빼와서 log를 기준으로 어떤 행동인지 파악하고,
// uid를 이용하여 user맵에서 최신으로 업데이트된 nickname을 가져와서 정답배열의 원소를 조합

import java.util.*;

public class 오픈채팅방 {
    static Map<String, String> user = new HashMap<>();
    static List<String[]> action = new ArrayList<>();

    public String[] solution(String[] record) {

        for (String e : record) {
            String[] s = e.split(" ");

            switch(s[0]) {
                case "Enter" :
                    Enter(s);
                    break;
                case "Leave" :
                    Leave(s);
                    break;
                case "Change" :
                    Change(s);
                    break;
            }
        }

        String[] answer = new String[action.size()];

        for (String[] e : action) {
            int idx = action.indexOf(e);
            String log = e[0];
            String nickname = user.get(e[1]);

            StringBuffer sb = new StringBuffer();
            switch(log) {
                case "0" :
                    sb.append(nickname);
                    sb.append("님이 들어왔습니다.");
                    answer[idx] = sb.toString();
                    break;
                case "1" :
                    sb.append(nickname);
                    sb.append("님이 나갔습니다.");
                    answer[idx] = sb.toString();
                    break;
            }
        }

        return answer;
    }

    public static void Enter(String[] s) { // enter의 log는 0
        // 만약 들어왔는데 기존에 들어왔던 기록이 있는 사람이라면,
        // change함수 실행
        String uid = s[1];
        String nickname = s[2];

        user.put(uid, nickname);
        action.add(new String[] {"0", uid}); // log uid

    }
    public static void Leave(String[] s) { // leave의 action은 1
        String uid = s[1];
        String nickname = user.get(s[1]);
        action.add(new String[] {"1", uid}); // log uid
    }
    public static void Change(String[] s) { // change의 action은 기록하지 않는다.
        String uid = s[1];
        String nickname = s[2];

        user.put(uid, nickname);
    }

    public static void main(String[] args) {
        오픈채팅방 answer = new 오픈채팅방();
//        System.out.println("answer.solution() = " + answer.solution());
    }
}
