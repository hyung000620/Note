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
           int cnt = 0;
           for(int i=1; i<=n; i++){
                if(n%i==0){
                    cnt ++;
                }
           }
           sb.append(String.valueOf(n)).append(" ")
           .append(String.valueOf(cnt)).append('\n');
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
}
