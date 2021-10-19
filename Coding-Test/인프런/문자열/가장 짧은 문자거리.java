import java.util.*;
public class Main {
  public int[] solution(String str, char ch){
  	int len = str.length();
    int[] answer = new int[len];
    int p = 1000;
    for(int i = 0; i<len; i++){
    	if(str.charAt(i) == ch){
        	p = 0;
          	answer[i] = p;
        }else{
        	p++;
          	answer[i] =p;
        }
    }
    p= 1000;
    for(int i=len-1; i>=0; i--){
    	if(str.charAt(i) == ch){
        	p = 0;
        }else{
        	p++;
          	answer[i] = Math.min(answer[i], p);
        }
    }
    
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    char ch = in.next().charAt(0);
    for(int x : main.solution(str, ch)){
    	System.out.print(x + " ");
    }
    
}
}
