package goorm.DeadOrAlive;
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        List<Map<Integer, Integer>> list = new ArrayList<>(); // {v : [w, 차량번호]}

        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            List<Integer> info = new ArrayList<>();
            info.add(w);
            info.add(i);
            if (!map.containsKey(v)) {
                List<List<Integer>> tmp = new ArrayList<>();
                tmp.add(info);
                map.put(v, tmp);
            } else{
                map.get(v).add(info);
            }
        }

        int answer = 0;
        for (Integer e : map.keySet()) {
            System.out.println(map.get(e).size());
            if (map.get(e).size() == 1) {
                answer++;
            } else {
                List<List<Integer>> cars = map.get(e);
            }
            // 			if (e.size() == 1)
// 				answer++;
// 			else {

// 			}
        }
    }
}