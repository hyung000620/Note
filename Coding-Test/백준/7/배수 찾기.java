import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(true){
            int t = Integer.parseInt(br.readLine());
            
            if(t==0) break;

            if(t%n==0){
                sb.append(t).append(" is a multiple of ").append(n).append(".").append('\n');
            }else{
                sb.append(t).append(" is NOT a multiple of ").append(n).append(".").append('\n');
            }
        }
        bw.write(sb.toString());

        br.close();
        

        bw.flush();
        bw.close();
    }
}
