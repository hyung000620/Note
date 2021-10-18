import java.util.*;
public class Main {
  public String solution(String str){
  	String answer = "";
    String[] arr = str.split(" ");
    int min = Integer.MIN_VALUE;
    for(String s : arr){
    	int len = s.length();
      	if(len > min){
        	min = len;
            answer = s;  
        }
    }
    return answer;
  }
  public static void main(String[] args){
	Main main = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    System.out.println(main.solution(str));
  }
}
