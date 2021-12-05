import java.util.*;
  
public class Main { // Sliding Window 알고리즘 : 시간복잡도 O(n)
  public int solution(String s, String t){ // ex) s : bacaAacba, t : abc
  	int answer =0;
    HashMap<Character, Integer> sMap = new HashMap<>();
    HashMap<Character, Integer> tMap = new HashMap<>();
    for(char ch : t.toCharArray()) tMap.put(ch,tMap.getOrDefault(ch,0)+1);
    int len = t.length()-1;
    for(int i=0; i<len; i++) sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
    int lt=0;
    for(int rt=len; rt<s.length(); rt++){
    	sMap.put(s.charAt(rt),sMap.getOrDefault(s.charAt(rt),0)+1);
        if(sMap.equals(tMap)) answer ++; //Map과 Map의 equals는 Key 값과 Value 값이 동일하면 true를 리턴해준다.
        sMap.put(s.charAt(lt),sMap.get(s.charAt(lt))-1); //밀고 나가야 되므로, 앞에 있는 Key의 Value 값을 1 감소시킨다.
        if(sMap.get(s.charAt(lt))==0) sMap.remove(s.charAt(lt)); // 만약 앞에 있던 Key의 Value 값이 0이면 해당 Key값을 삭제시킨다.
        lt++; //lt값 증가후 다시 for문이 돌면서 rt값이 증가.         
    }
    return answer;
  }
  public static void main(String[] args){
    Main M = new Main();
    Scanner in=new Scanner(System.in);
  	String s = in.next(); //ex) bacaAacba
    String t = in.next(); //ex) abc
    System.out.println(M.solution(s,t));
  }
}
