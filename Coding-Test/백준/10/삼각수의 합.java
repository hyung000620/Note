import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        while(T-->0){
            int n = Integer.parseInt(br.readLine());
            int sum =0;
            for(int i=1; i<=n; i++){
                sum +=i*getIn(i+1);
            }
            sb.append(sum).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    public static int getIn(int n){
        return n *(n+1)/2;
    }
    
}
