import java.util.*;  
class Main {
  public int solution(String str, char ch){
  	int answer = 0;
    str = str.toUpperCase();
    ch = Character.toUpperCase();
    for(int i=0; i < str.length(); i++){
    	if(str.charAt(i) == ch){
        answer ++;
        }
    }
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    char ch = in.next().charAt(0);
    System.out.println(T.solution(str,ch));
  }
}
