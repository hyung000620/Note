import java.util.*;
  
public class Main {
  public int solution(String s, String t){
  	int answer =0;
    HashMap<Character, Integer> sMap = new HashMap<>();
    HashMap<Character, Integer> tMap = new HashMap<>();
    for(char ch : t.toCharArray()) tMap.put(ch,tMap.getOrDefault(ch,0)+1);
    int len = t.length()-1;
    for(int i=0; i<len; i++) sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
    int lt=0;
    for(int rt=len; rt<s.length(); rt++){
    	sMap.put(s.charAt(rt),sMap.getOrDefault(s.charAt(rt),0)+1);
        if(sMap.equals(tMap)) answer ++;
        sMap.put(s.charAt(lt),sMap.get(s.charAt(lt))-1);
        if(sMap.get(s.charAt(lt))==0) sMap.remove(s.charAt(lt));
        lt++;         
    }
    return answer;
  }
  public static void main(String[] args){
    Main M = new Main();
    Scanner in=new Scanner(System.in);
  	String s = in.next();
    String t = in.next();
    System.out.println(M.solution(s,t));
  }
}
