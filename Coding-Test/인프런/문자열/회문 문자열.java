import java.util.*;
public class Main {
  public String solution(String str){
  	String answer = "NO";
  	str = str.toUpperCase();
    String str2 = new StringBuilder(str).reverse().toString();
    if(str.equals(str2)){return "YES";}
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(main.solution(str));
  }
}
