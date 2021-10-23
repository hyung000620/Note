import java.util.Scanner;
  
public class Main {
  public int solution(int std, int test, int[][] arr){
  	int answer =0;
    for(int i=1; i<=std; i++){
    	for(int j=1; j<=std; j++){
        	int cnt=0;	
          	for(int k=0; k<test; k++){
              int pi =0, pj=0;
            	for(int s=0; s<std; s++){
					if(arr[k][s] ==i) pi=s;
                  	if(arr[k][s] ==j) pj=s;
            	}
              if(pi<pj) cnt++;
            }
          if(cnt == test) answer++;
        }
      
    }
    return answer;
  }
  public static void main(String[] args){
    Main M = new Main();
    Scanner in=new Scanner(System.in);
    int std = in.nextInt();
    int test = in.nextInt();
    int[][] arr = new int[test][std];
    for(int i=0; i<test; i++){
    	for(int j=0; j<std; j++){
        	arr[i][j] = in.nextInt();
        }
    }
    System.out.println(M.solution(std, test, arr));
  }
}
