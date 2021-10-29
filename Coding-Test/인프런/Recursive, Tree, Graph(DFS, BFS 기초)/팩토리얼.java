import java.util.*;
public class Main{
  public int factorial(int n){
    if(n==1) return 1;
    else{
      return n*factorial(n-1);
    }
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Main T = new Main();
    System.out.println(T.factorial(n));
  }
}
