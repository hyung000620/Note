import java.util.*;
  
public class Main {
  public String solution(String str1, String str2){
  	String answer ="YES";
    HashMap<Character, Integer> map = new HashMap<>(); // HashMap 의 Key: Character, Value: Integer
    for(char x : str1.toCharArray()){
    	map.put(x,map.getOrDefault(x,0)+1); // Key가 하나라도 있으면 Value 값에 1이 입력된다.
    }
    for(char x : str2.toCharArray()){
    	if(!map.containsKey(x) || map.get(x) == 0) return "NO"; // Key 값이 존재하지 않거나 Key의 Value 값이 0일경우 아나그램이 되지 않는다.
      	map.put(x,map.get(x)-1); //만약 Key값이 있을 경우 Value 값을 1을 빼준다.
    }
    return answer;
  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    String str1 = in.next();
    String str2 = in.next();
    System.out.println(T.solution(str1,str2));
  }
}
