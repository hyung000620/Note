import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int B = Integer.parseInt(br.readLine());

        int P = 5*B-400;
        int kPa = P>=100?P==100?0:-1:1;

        System.out.println(P);
        System.out.println(kPa);
    }    
}
