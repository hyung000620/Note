import java.util.*;
public class Main {
  public int solution(int n , int[] arr){
  	int answer =1, max = arr[0];
    for(int i=1; i<n; i++){
    	if(arr[i]>max){
        	answer ++;
          	max = arr[i];
        }
    }
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[] stu = new int[n];
    for(int i=0; i<n; i++){
    	stu[i] = in.nextInt();
    }
    System.out.println(main.solution(n, stu));
  }
}
