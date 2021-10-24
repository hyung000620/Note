import java.util.*;
public class Main {
  public char solution(int n, String str){
    char answer = ' ';
    HashMap<Character, Integer> map = new HashMap<>();
    for(char x: str.toCharArray()){
      map.put(x,map.getOrDefault(x,0)+1);
    }
    int max = Integer.MIN_VALUE;
    for(char key: map.keySet()){
      if(map.get(key)>max){
      	max = map.get(key);
        answer = key;
      }
    }
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    String str = in.next();
    System.out.println(T.solution(n, str));
  }
}
