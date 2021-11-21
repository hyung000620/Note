import java.util.*;
public class Main{
    public static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int sum = 0;
        int answer = Integer.MAX_VALUE;
        for(int i = M; i<=N; i++){
            if(isPrime(i)==true){
                sum += i;
                answer = Math.min(answer, i);
            }
        }
        if(sum == 0) {
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(answer);
        }
    }
}
