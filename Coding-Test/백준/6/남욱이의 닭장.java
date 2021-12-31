import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int U = 2*M-N;
            int l = M-U;
            sb.append(U).append(" ").append(l).append('\n');
        }

        System.out.print(sb);
    }
}
