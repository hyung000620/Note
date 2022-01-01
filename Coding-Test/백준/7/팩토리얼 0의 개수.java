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

        int cnt = 0;
        while(N>=5){
            cnt += N/5;
            N /=5;
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
    
}
