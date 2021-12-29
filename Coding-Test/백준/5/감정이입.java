import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long A = Long.parseLong(br.readLine(),2);
        long B = Long.parseLong(br.readLine(),2);

        String ans = Long.toBinaryString(A*B);

        System.out.println(ans);
    }
}
