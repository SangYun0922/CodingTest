package programmers.level2;

import java.util.*;
public class 파일명정렬 {
    public String[] solution(String[] files) {
        String[] answer = {};
        Arrays.sort(files, new customComparator());
        return files;
    }

    public static String[] divide(String x) {
        String s = x.toLowerCase();
        String[] res = new String[3];
        int flag = 0;
        StringBuffer head = new StringBuffer();
        StringBuffer number = new StringBuffer();
        StringBuffer tail = new StringBuffer();

        int idx = 0;
        for (; idx < s.length(); idx++) {
            char c = s.charAt(idx);
            if (c >= '0' && c <= '9') break;
            head.append(c);
        }

        for (; idx < s.length(); idx++) {
            char c = s.charAt(idx);
            if (!(c >= '0' && c <= '9')) break;
            number.append(c);
        }

        for (; idx < s.length(); idx++) {
            char c = s.charAt(idx);
            tail.append(c);
        }
        res[0] = head.toString();
        res[1] = number.toString();
        res[2] = tail.toString();
        return res;
    }
    public class customComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            String[] o1 = divide(s1);
            String[] o2 = divide(s2);

            int headCompare = o1[0].compareTo(o2[0]);

            if (headCompare == 0) {
                int s1_num = Integer.parseInt(o1[1]);
                int s2_num = Integer.parseInt(o2[1]);

                return s1_num - s2_num; // 만약 이것까지도 0이면 자리가 바뀌지 않는다.
            } else {
                return headCompare;
            }
        }
    }

    public static void main(String[] args) {
        파일명정렬 answer = new 파일명정렬();
//        System.out.println("answer.solution() = " + answer.solution());
    }
}
