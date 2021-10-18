import java.util.*;
public class Main {
  public String solution(String str){
  	String answer ="";
    char[] ch = str.toCharArray();
    int lt =0, rt= str.length()-1;
    while(lt<rt){
      if(!Character.isAlphabetic(ch[lt])) lt ++;
      else if(!Character.isAlphabetic(ch[rt])) rt --;
      else{
      	char tmp = ch[lt];
        ch[lt] = ch[rt];
        ch[rt] = tmp;
        lt++;
        rt--;
      }
    }
    answer = String.valueOf(ch);
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(main.solution(str));
  }
}
