import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double A, B;
        double result;
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextDouble();
        B = scan.nextDouble();
        
        result = A/B;
        
        scan.close();
        System.out.println(result);
    }
}
