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
            int n = Integer.parseInt(br.readLine());
            if(n==-1) break;
            int cnt = 0;
            int result = 0;
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                int speed = Integer.parseInt(st.nextToken());
                int hour = Integer.parseInt(st.nextToken());
                result += speed*(hour-cnt);
                cnt = hour;
            }
            sb.append(result).append(" miles").append('\n');
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    
}
