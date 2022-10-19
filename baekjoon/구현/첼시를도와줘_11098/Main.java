package baekjoon.구현.첼시를도와줘_11098;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test_Case = Integer.parseInt(br.readLine());

        while(Test_Case-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Map<Integer, String> players = new HashMap<>();
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int price = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                players.put(price, name);

            }
            List<Integer> key_set = new ArrayList<>(players.keySet());
            System.out.println(players.get(Collections.max(key_set)));
        }
    }
}
