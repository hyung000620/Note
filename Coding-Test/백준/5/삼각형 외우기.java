import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        if(A==60 && B==60 && C==60){
            System.out.println("Equilateral");
        }else if(A!=B && B!=C && C!=A && A+B+C == 180){
            System.out.println("Scalene");
        }else if(A+B+C != 180){
            System.out.println("Error");
        }else{
            System.out.println("Isosceles");
        }
    }
}
