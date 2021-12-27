import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int J = Integer.parseInt(br.readLine());
        
        int sum = (J - 1) * (J - 2) * (J - 3) / 6;
        
        System.out.println(sum);
    }
}
