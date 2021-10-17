import java.util.*; 
class Main {
  public String solution(String str){
  	String answer ="";
    for(char x : str.toCharArray()){
    	if(Character.isLowerCase(x)){
        	answer += Character.toUpperCase(x);
        }else{
        	answer += Character.toLowerCase(x);
        }
    }
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.print(T.solution(str));
  }
}
