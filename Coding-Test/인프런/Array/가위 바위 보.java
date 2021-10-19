import java.util.*;
public class Main {
  public String solution(int[] a, int[] b){
  	String answer ="";
    for(int i=0; i< a.length; i++){
    	if(a[i] == b[i]) answer +="D";
      	else if(a[i]==1 && b[i]==3) answer +="A";
      	else if(a[i]==2 && b[i]==1) answer +="A";
      	else if(a[i]==3 && b[i]==2) answer +="A";
      	else answer += "B";
    }
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[] A = new int[n];
    int[] B = new int[n];
    for(int i=0; i<n; i++){
    	A[i] = in.nextInt();
    }
    for(int i=0; i<n; i++){
    	B[i] = in.nextInt();
    }
    for(char a : main.solution(A,B).toCharArray()){
    	System.out.println(a);
    }
  }
}
