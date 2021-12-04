/**
현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
각 구간별로 구하라고 했습니다.
만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
20 12 20 10 23 17 10
각 연속 4일간의 구간의 매출종류는
첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
매출액의 종류를 출력하는 프로그램을 작성하세요.
**/

import java.util.*;
public class Main {
  public ArrayList<Integer> solution(int n, int k, int[] arr){
    ArrayList<Integer> answer = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<k-1; i++){ // map: 20,12,20 까지 들어가 있다.
    	map.put(arr[i],map.getOrDefault(arr[i],0)+1); // 각 Key를 Map에 넣으면서 map.getOrDefaulf() 로 카운팅을 한다.
    }
    int lt=0;
    for(int rt=k-1; rt<n; rt++){
    	map.put(arr[rt],map.getOrDefault(arr[rt],0)+1); // map:10을 넣어 현재 map에는 {20,12,20,10}이 있고 각 Key값과 Value를 카운팅한다.
      	answer.add(map.size()); // Key의 종류는 20,12,10이 있으므로 ArrayList에는 3이 추가된다.
      	map.put(arr[lt],map.get(arr[lt])-1); // lt에 해당하는 20에 Value값을 1 삭제한다.
      	if(map.get(arr[lt])==0) map.remove(arr[lt]); //만약 lt에 해당하는 값이 없으면 해당되는 키를 삭제한다 삭제를 한다.
      	lt ++; // lt를 증가
    }
    
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
    	arr[i] = in.nextInt();
    }
    for(int x : T.solution(n, k, arr)){
    	System.out.print(x+" ");
    }
    }
}
