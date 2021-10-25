import java.util.*;
  
public class Main {
  public int solution(String str){
  	int answer =0;
    Stack<Integer> stack = new Stack<>();
    for(char ch : str.toCharArray()){
    	if(Character.isDigit(ch)) stack.push(ch-'0');
		else{
        	int rt = stack.pop();
          	int lt = stack.pop();
          	if(ch == '+') stack.push(lt+rt);
          	else if(ch == '-') stack.push(lt-rt);
          	else if(ch == '*') stack.push(lt*rt);
          	else if(ch == '/') stack.push(lt/rt);
        }      	
    }
    answer = stack.get(0);
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
  	String str = in.next();
    System.out.println(T.solution(str));
  }
}
