import java.util.*; 
public class Main {
  public ArrayList<String> solution(String[] arr){
  	ArrayList<String> answer = new ArrayList<>();
    for(String s: arr){
    	String str = new StringBuilder(s).reverse().toString();
    	answer.add(str);
    }
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    String[] arr = new String[num];
    for(int i =0; i< num; i++){
    	arr[i] = in.next();
    }
    for(String s: main.solution(arr)){
    System.out.println(s);
    }
    }
}
