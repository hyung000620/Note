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
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int cnt = 0;

            for(int b=1; b<n-1; b++){
                for(int a=b+1; a<n; a++){
                   int tmp = a*a + b*b + m;
                   if(tmp%(a*b)==0){
                       cnt++;
                   }
                }
            }
            sb.append(String.valueOf(cnt)).append('\n');    
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
