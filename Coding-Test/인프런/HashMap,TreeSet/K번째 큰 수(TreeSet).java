import java.util.*;
  
public class Main {
  public int solution(int n, int k, int[] arr){
  	int answer = -1;
    TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
    for(int i=0; i<n; i++){
    	for(int j=i+1; j<n; j++){
        	for(int m=j+1; m<n; m++){
            	set.add(arr[i]+arr[j]+arr[m]);
            }
        }
    }
    int cnt=0;
    for(int x : set){
    	cnt++;
      	if(cnt==k) return x;
    }
    
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
    	arr[i] = in.nextInt();
    }
    System.out.println(T.solution(n, k, arr));
  }
}
