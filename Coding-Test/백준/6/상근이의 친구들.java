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
        
        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int M = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken());

            if(M==0 && F==0) break;

            bw.write(String.valueOf(M+F));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
    
}
