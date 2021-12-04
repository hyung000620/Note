import java.util.*;
public class Main {
  public char solution(int n, String str){
    char answer = ' ';
    HashMap<Character, Integer> map = new HashMap<>(); // Key : Character, Value : Integer
    for(char x: str.toCharArray()){ 
      map.put(x, map.getOrDefault(x, 0)+1); // map.getOrDefault()는 map.get(Key)를 가져오되 없으면 0을 리턴을 하는 메소드이다. 있으면 거기서 1을 더해준다.
    }
    int max = Integer.MIN_VALUE; // max이므로 가장 작은 값인 Integer.MIN_VALUE를 사용해야한다.
    for(char key: map.keySet()){ // map.KeySet()을 하면 map에 존재하는 Key들을 전부 탐색하게 된다.
      if(map.get(key)>max){ //map.get(key) 는 Key 의 Value 값을 가져오게 된다.
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
/** 그 외 HashMap의 메소드
- map.containsKey('A'); :A 라는 key가 있는지를 확인하는 메소드이며, 리턴타입은 Boolean 타입이다.
- map.size() : Key의 개수를 알려주는 메소드.
- map.remove('A') : 'A'에 해당하는 Key를 삭제하는 메소드
**/
