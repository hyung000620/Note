import java.util.*;
public class Main {
  public int[] solution(int n){
  	int[] answer = new int[n];
    answer[0] = 1;
    answer[1] = 1;
    for(int i=2; i<n; i++){
    	answer[i] = answer[i-1] + answer[i-2];
    }
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
	for(int x: main.solution(n)){
    	System.out.print(x+" ");
    }
  }
}
