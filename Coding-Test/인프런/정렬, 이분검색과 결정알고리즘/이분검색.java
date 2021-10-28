import java.util.*;
  
public class Main {
  public int solution(int n, int idx, int[] arr){
  	int answer = 1;
    Arrays.sort(arr);
    int lt=0, rt=n-1;
    while(lt<=rt){
      int mid = (lt+rt)/2;
      if(arr[mid]==idx) {
        answer += mid;
      	break;
      }
      if(arr[mid]>idx) rt = mid-1;
      else lt = mid+1;
    }
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int idx = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) arr[i] = in.nextInt();
    System.out.println(T.solution(n, idx, arr));
  }
}
