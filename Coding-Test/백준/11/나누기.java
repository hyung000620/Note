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
        int F = Integer.parseInt(br.readLine());

        int tmp = (N/100)*100;
        StringBuilder sb = new StringBuilder();
        while(true){
            if(tmp%F == 0){
                int result = tmp %100;
                if(result<10) sb.append(String.valueOf(0)).append(String.valueOf(result));
                else sb.append(String.valueOf(result));
                break;
            }
            tmp ++;
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
