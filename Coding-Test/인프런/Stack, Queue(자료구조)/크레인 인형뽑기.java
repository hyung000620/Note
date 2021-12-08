import java.util.*;
  
public class Main {
  public int solution(int n, int[][] arr, int move, int[] board){
    int answer =0;
    Stack<Integer> stack = new Stack<>();
    for(int pos : board){
    	for(int i =0; i<n; i++){
        	if(arr[i][pos-1]!=0){
              int tmp = arr[i][pos-1];
              arr[i][pos-1] = 0;
              if(!stack.isEmpty() && tmp == stack.peek()){answer+=2; stack.pop();} // 가장 상단에 값 비교.
              else{stack.push(tmp);}
              break;
            }
    	}
    }
    
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n][n];
    for(int i=0; i<n; i++){
    	for(int j=0; j<n; j++){
        	arr[i][j] = in.nextInt();
        }
    }
    int m = in.nextInt();
    int[] board = new int[m];
    for(int k=0; k<m; k++){
    	board[k] = in.nextInt();
    }
    System.out.println(T.solution(n, arr, m, board));
  }
}
