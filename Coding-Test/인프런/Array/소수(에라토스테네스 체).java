import java.util.*; 
public class Main {
  public int solution(int n){
  	int answer = 0;
    int[] arr = new int[n+1];
    for(int i=2; i<=n; i++){
    	if(arr[i]==0) answer ++;
      	for(int j=i; j<=n; j=j+i){
        	arr[j] =1; 
        }
    }
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    System.out.println(main.solution(num));
  }
}
