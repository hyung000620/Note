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
        
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int l = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());

            if(l==0 && w == 0 && a==0) break;
            if(l==0) l = a/w;
            if(w==0) w = a/l;
            if(a==0) a = l*w;
        
            sb.append(l+" ").append(w+" ").append(a).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
