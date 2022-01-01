import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        String str = Integer.toBinaryString(N);

        str = new StringBuilder(str).reverse().toString();

        int result = Integer.parseInt(str,2);

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
    
}
