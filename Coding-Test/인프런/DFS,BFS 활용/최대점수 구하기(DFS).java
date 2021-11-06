import java.util.*;
  
public class Main {
  static int answer = Integer.MIN_VALUE, n, m;
  public void DFS(int L, int sum,int time, int[] arr, int[] brr){
    if(time>m) return;
    if(L==n){
    	answer = Math.max(answer, sum);
    }else{
    	DFS(L+1,sum+arr[L],time+brr[L],arr,brr);
      	DFS(L+1,sum,time,arr,brr);
    }
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    n = in.nextInt();
    m = in.nextInt();
    int[] arr = new int[n];
    int[] brr = new int[n];
    for(int i=0; i<n; i++){
    	arr[i] = in.nextInt();
		brr[i] = in.nextInt();
    }
    T.DFS(0,0,0,arr,brr);
    System.out.println(answer);
  }
}
