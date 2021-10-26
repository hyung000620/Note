import java.util.*;
  
public class Main {
  public String solution(String need, String plan){
  	String answer = "YES";
    Queue<Character> qu = new LinkedList<>();
    for(char ch : need.toCharArray()) qu.offer(ch);
    for(char ch : plan.toCharArray()){
    	if(qu.contains(ch)){
        	if(ch!=qu.poll()) return "NO";
        }
    }
    if(!qu.isEmpty())return "NO";
    
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    String need = in.next();
    String plan = in.next();
    System.out.println(T.solution(need, plan));
  }
}
