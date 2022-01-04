import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int k = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);

            for(int i=0; i<k; i++){
                sb.append(c);
            }
            sb.append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
