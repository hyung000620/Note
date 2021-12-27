import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(br.readLine());

        double result = 25+n*0.01;
        result = Math.max(result,100.00);
        result = Math.min(result,2000.00);
        
        System.out.println(result);
    }    
}
