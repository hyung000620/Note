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
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int cnt = 0;
            
            for(int i=N; i<=M; i++){
                String s = String.valueOf(i);
                for(int j=0; j<s.length(); j++){
                    if(s.charAt(j)=='0'){
                        cnt ++;
                    }
                }
            }
            
            sb.append(cnt).append('\n');
        
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
