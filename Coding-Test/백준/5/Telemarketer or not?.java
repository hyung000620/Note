import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        int num4 = Integer.parseInt(br.readLine());

        if(num1 > 7 && num4> 7 && num2 == num3 ){
            System.out.println("ignore");
            System.exit(0);
        }
        System.out.println("answer");
        
    }
}
