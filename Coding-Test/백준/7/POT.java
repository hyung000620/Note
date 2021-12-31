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
        long X = 0;
        while(N-->0){
            int tmp = Integer.parseInt(br.readLine());
            X += Math.pow(tmp/10, tmp%10);
        }

        bw.write(String.valueOf(X));

        bw.flush();
        bw.close();
    }
}
