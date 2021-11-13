import java.util.*;
class Body implements Comparable<Body>{
	int h,w;
  	Body(int h, int w){
    	this.h = h;
      	this.w = w;
    }
  	@Override
  	public int compareTo(Body o){
    	return o.h - this.h;
    }
}
public class Main {
  public int solution(ArrayList<Body> arr, int n){
  	int cnt = 0;
    Collections.sort(arr);
    int max = Integer.MIN_VALUE;
    for(Body o : arr){
      	if(o.w > max){
        	max = o.w;
          	cnt ++;
        }
    }
    return cnt;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    ArrayList<Body> arr = new ArrayList<>();
    for(int i=0; i<n; i++){
    	int h = in.nextInt();
      	int w = in.nextInt();
      	arr.add(new Body(h, w));
    }
    System.out.println(T.solution(arr, n));
  }
}
