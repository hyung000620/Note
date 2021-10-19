import java.util.*; 
public class Main {
  public ArrayList<Integer> solution(int[] arr, int n){
  	ArrayList<Integer> answer = new ArrayList<>();
    answer.add(arr[0]);
    for(int i =1; i<n; i++){
    	if(arr[i]>arr[i-1]) answer.add(arr[i]);
    }
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    int cnt = in.nextInt();
    int[] num = new int[cnt];
    for(int i=0; i<cnt; i++){
    	num[i] = in.nextInt();
    }
    for(int x: main.solution(num, cnt)){
    System.out.print(x+" ");
    }
    }
}
