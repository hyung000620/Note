import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d1 = Integer.parseInt(br.readLine())*2;
        double d2 = Double.parseDouble(br.readLine());

        double result = d1 + (2*d2*3.141592);

        System.out.println(result);
        System.exit(0);
    }
}
