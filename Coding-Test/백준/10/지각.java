import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            int d = Integer.parseInt(br.readLine());
            int s =0, t = 0;
            while(true){
                if(d<s+t) {
                    t--;
                    break;
                }
                t++;
                s = t*t;
            }
            sb.append(t).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
