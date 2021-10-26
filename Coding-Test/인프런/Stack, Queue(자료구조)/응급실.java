import java.util.*;
class Person{
  	int id;
  	int priority;
	Person(int id, int priority){
    	this.id = id;
      	this.priority = priority;
    }
}
public class Main {
  public int solution(int n, int m, int[] arr){
  	int answer = 0;
    Queue<Person> Q = new LinkedList<>();
    for(int i=0; i<n; i++){
    	Q.offer(new Person(i, arr[i]));
    }
    while(!Q.isEmpty()){
    	Person tmp = Q.poll();
      	for(Person p : Q){
        	if(p.priority > tmp.priority){
            	Q.offer(tmp);
              	tmp = null;
              	break;
            }
        }
      if(tmp != null){
      	answer ++;
        if(tmp.id == m) return answer;
      }
    }
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
    	arr[i] = in.nextInt();
    }
    System.out.println(T.solution(n, m, arr));
  }
}
