import java.util.*;
  
public class Main {
  public int solution(int n, int k, int[] arr){
  	int answer = -1;
    TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); //TreeSet은 중복도 제거하고, 정렬도 해줄수 있다.
    for(int i=0; i<n; i++){
    	for(int j=i+1; j<n; j++){
        	for(int m=j+1; m<n; m++){
            	set.add(arr[i]+arr[j]+arr[m]);
            }
        }
    }
    int cnt=0; // k번째 수를 찾기 위해 counting 할 변수를 지정해준다.
    for(int x : set){
    	cnt++;
      	if(cnt==k) return x;
    }
    
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
    	arr[i] = in.nextInt();
    }
    System.out.println(T.solution(n, k, arr));
  }
}
// TreeSet의 그 외 메소드
// .remove() : 해당되는 값을 삭제.
// .size() : TreeSet의 크기
// .first() : 제일 첫번째 값. (오름차순일 경우와 내림차순일 경우 값이 다름)
// .last() : 맨 마지막 값.
