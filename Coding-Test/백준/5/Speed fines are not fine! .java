import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine()); // 제한속도
        int B = Integer.parseInt(br.readLine()); // 내 속도

        int result = B-A;

        if(result<=0){
            System.out.println("Congratulations, you are within the speed limit!");
        }else{
            int f = 0;
            if(result<=20){
                f=100;
            }else if(result>20 && result<=30){
                f=270;
            }else{
                f=500;
            }
            System.out.println("You are speeding and your fine is $"+f+".");
        }
    }
}
