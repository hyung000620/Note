import java.util.*;
  
public class Main {
  public String solution(String str){
  	String answer = "";
    Stack<Character> stack = new Stack<>();
    for(char x : str.toCharArray()){
      	if(x == ')'){
        	while(stack.pop()!='(');
        }else stack.push(x);
    }
    for(char x : stack){
    	answer += x;
    }
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(T.solution(str));
  }
}
