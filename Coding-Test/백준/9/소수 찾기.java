import java.util.*;
public class Main{
    public boolean isPrime(int num){
		if(num==1) return false;
		for(int i=2; i<num; i++){
			if(num%i==0) return false;
		}
		return true;
	}
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int answer = 0;
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
            if(T.isPrime(arr[i]) == true) answer ++;
        }
        System.out.println(answer);
    }
}
