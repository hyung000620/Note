import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int result = 0;
        for(int i =0; i<=a; i++){
            result += i; 
        }
        in.close();
        System.out.println(result);
    }
}
