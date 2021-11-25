import java.util.*;
public class Main{
    public int solution(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        else{
            return solution(n-1)+ solution(n-2);
        }
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }
}
