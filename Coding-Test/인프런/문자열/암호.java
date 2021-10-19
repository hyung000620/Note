import java.util.*;
public class Main {
  public String solution(int n, String s){
  	String answer ="";
    for(int i=0; i<n; i++){
    	String tmp = s.substring(0,7).replace('#','1').replace('*','0');
      	answer += (char)Integer.parseInt(tmp, 2);
      	s = s.substring(7);
    }
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    String str = in.next();
    System.out.println(main.solution(num, str));
  }
}
