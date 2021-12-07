import java.util.*;
  
public class Main {
  public String solution(String str){
  	String answer = "";
    Stack<Character> stack = new Stack<>();
    for(char x : str.toCharArray()){
      	if(x == ')'){
        	while(stack.pop()!='('); // '('이 아닐때까지 Stack.pop()를 실행
        }else stack.push(x);
    }
    for(char x : stack){
    	answer += x;
    }
    /**
    for(int i=0; i<stack.size(); i++) answer += stack.get(i); //로도 가능
    **/
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(T.solution(str));
  }
}
