public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuffer route = new StringBuffer();
            String bin_tmp1 = toBinary(n, Integer.toBinaryString(arr1[i]));         // n에 맞추어 2진수로 변경
            String bin_tmp2 = toBinary(n, Integer.toBinaryString(arr2[i]));        // n에 맞추어 2진수로 변경
            for (int j = 0; j < n; j++) {
                if (bin_tmp1.charAt(j) == '1' || bin_tmp2.charAt(j) == '1')
                    route.insert(j,"#");
                else
                    route.insert(j," ");
            }
            answer[i] = route.toString();
        }
        return answer;
    }

    public String toBinary(int n, String arg) {
        StringBuffer res = new StringBuffer(arg);
        if (arg.length() < n) {
            for (int i = 0; i < n - arg.length(); i++) {
                res.insert(0, "0");
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        비밀지도 answer = new 비밀지도();
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] res = answer.solution(5, arr1, arr2);
        for (String e : res)
            System.out.println("e = " + e);
    }
}
