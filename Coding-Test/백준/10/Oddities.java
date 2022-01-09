import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            sb.append(N).append(" is ");
            if(N%2==0){
                sb.append("even");
            }else{
                sb.append("odd");
            }
            sb.append('\n');
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    
}
