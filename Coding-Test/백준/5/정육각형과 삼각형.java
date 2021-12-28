import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int s = Integer.parseInt(br.readLine());
        
        double result = (Math.sqrt(3)/4)*Math.pow(s, 2);

        System.out.printf("%.15f",result);
    }
}
