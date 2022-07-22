package programmers.level1;

public class 소수찾기 {
    public int solution(int n) {
        int answer = 0;
        boolean[] sosu =new boolean [n+1];

        for(int i=2; i<=n ; i++)
            sosu[i]=true;
        //에라테네스
        int root=(int)Math.sqrt(n);

        for(int i=2; i<=root; i++){
            if(sosu[i]==true){
                for(int j=i; i*j<=n; j++)
                    sosu[i*j]=false;
            }
        }
        for(int i =2; i<=n; i++)  {
            if(sosu[i]==true)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        소수찾기 answer = new 소수찾기();
        System.out.println("answer.solution(10) = " + answer.solution(10));
    }

}
