package programmers.level2;

import java.util.*;
public class 뉴스클러스터링 {
    public int solution(String str1, String str2) {

        // 대소문자 구별을 없애기 위해 소문자로 통일
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // 두 글자씩 끊어서 배열에 저장한다면, 배열의 길이는 str의 길이 - 1이 된다.
        // 그러나 중간에 버리는 원소가 있으므로 배열의 길이가 일정하지 않다.
        // 따라서 ArrayList로 선언하자
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // 각각의 원소에 두글자씩 슬라이스한 원소를 담자
        for (int i = 0; i < str1.length()-1; i++) {
            String s = "";
            char tmp1 = str1.charAt(i);
            char tmp2 = str1.charAt(i+1);

            if ((tmp1 >= 'a' && tmp1 <= 'z') && (tmp2 >= 'a' && tmp2 <= 'z')) {
                s += tmp1;
                s += tmp2;
                list1.add(s);
            }
        }
        for (int i = 0; i < str2.length()-1; i++) {
            String s = "";
            char tmp1 = str2.charAt(i);
            char tmp2 = str2.charAt(i+1);

            if ((tmp1 >= 'a' && tmp1 <= 'z') && (tmp2 >= 'a' && tmp2 <= 'z')) {
                s += tmp1;
                s += tmp2;
                list2.add(s);
            }
        }

        // list1, list2 모두 공집합이면 1 리턴
        if (list1.size() == 0 && list2.size() == 0)
            return 1 * 65536;

        // 교집합과 합집합을 담아둘 ArrayList 선언해주자
        List<String> inter = new ArrayList<>();
        List<String> union = new ArrayList<>();

        for (String e : list1) {
            if (list2.remove(e))
                inter.add(e);
            union.add(e);
        }
        union.addAll(list2);

        // 자카드 유사도 계산
        double x = ((double) inter.size() / (double) union.size()) * 65536;

        return (int) x;
    }

    public static void main(String[] args) {
        뉴스클러스터링 answer = new 뉴스클러스터링();
        System.out.println("answer.solution(\"FRANCE\", \"french\") = " + answer.solution("FRANCE", "french"));
    }
}
