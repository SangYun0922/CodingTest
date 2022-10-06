package level2;

import java.util.*;
public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        for (String nums : phone_book) {
            hash.put(nums, 1);
        }
        for(String key : hash.keySet()) {
            char[] arr = key.toCharArray();
            for(int index = 0; index < key.length(); index++){
                if( hash.containsKey( key.substring(0, index) ) ){
                    return false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book = {"123","456","789"};
        전화번호목록 answer = new 전화번호목록();
        System.out.println("answer = " + answer.solution(phone_book));
    }
}
