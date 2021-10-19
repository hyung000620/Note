import java.util.Scanner;
public class Main {
  public int solution(String str){
    int answer = 0;
    str = str.toUpperCase().replaceAll("[A-Z]","");
    answer = Integer.parseInt(str);
    return answer;
  }
  public static void main(String[] args){
    Main main = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    System.out.println(main.solution(str));
  }
}
