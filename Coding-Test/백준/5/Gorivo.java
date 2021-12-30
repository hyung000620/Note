import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(br.readLine());

        double result = 100/(1.609344/3.785411784*x);
        
        System.out.printf("%.6f",result);
    }
}
