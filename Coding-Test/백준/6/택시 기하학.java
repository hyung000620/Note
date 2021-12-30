import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(br.readLine());
        
        double result1 = n*n*Math.PI;
        double result2 = n*n*2;

        System.out.printf("%.6f\n",result1);
        System.out.printf("%.6f",result2);
    }
}
