import java.util.Scanner;
  
public class Main {
  public int[] solution(int size, int n, int[] arr){
  	int[] answer = new int[size];
    for(int x: arr){
    	int pos = -1;
      	for(int i=0; i<size; i++) if(answer[i]==x) pos = i; //동일한 값 확인.
      	if(pos==-1){ //Miss
        	for(int i=size-1; i>=1; i--) answer[i] = answer[i-1];
          	answer[0] = x;
        }else{ //Hit
        	for(int i=pos; i>=1; i--) answer[i] = answer[i-1];
          	answer[0] = x;
        }
    }
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int s = in.nextInt();
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
    	arr[i] = in.nextInt();
    }
    for(int x: T.solution(s, n, arr)){
    	System.out.print(x+ " ");
    }
    }
}
