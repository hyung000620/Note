import java.util.*;
class Office implements Comparable<Office>{
	int start, end;
  	Office(int start, int end){
    	this.start = start;
      	this.end = end;
    }
  	
  	@Override
  	public int compareTo(Office o){
    	if(this.end == o.end) return this.start - o.start;
      	else return this.end - o.end;
    }
}
public class Main {
  public int solution(ArrayList<Office> arr, int n){
  	int cnt = 0;
    Collections.sort(arr);
    int et = 0;
    for(Office o : arr){
      if(o.start >= et){
      	cnt ++;
        et = o.end;
      }
    }
    return cnt;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    ArrayList<Office> list = new ArrayList<>();
    for(int i=0; i<n; i++){
      int s = in.nextInt();
      int e = in.nextInt();
      list.add(new Office(s, e));
    }
    System.out.println(T.solution(list, n));
  }
}
