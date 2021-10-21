import java.util.*;
public class Main {
  public int[] solution(int n, int[] arr){
  	int[] answer = new int[n];
    for(int i=0; i<n; i++){
		int cnt =1;
      	for(int j=0; j<n; j++){
        	if(arr[j]>arr[i]) cnt++;
        }
      	answer[i]=cnt;
    }
    
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[] score = new int[n];
    for(int i=0; i< n; i++){
		score[i] = in.nextInt();    
    }
    for(int x : main.solution(n, score)){
    	System.out.print(x+ " ");
    }
    }
}
