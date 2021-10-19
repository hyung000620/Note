import java.util.*;
public class Main {
  public String solution(String s){
  	String answer = "NO";
    s = s.toUpperCase().replaceAll("[^A-Z]","");
    String str = new StringBuilder(s).reverse().toString();
    if(s.equals(str)) answer ="YES";
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    System.out.println(main.solution(str));
  }
}
