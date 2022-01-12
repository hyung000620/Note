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

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(T-->0){
            int N = Integer.parseInt(st.nextToken());
            max = Math.max(max, N);
            min = Math.min(min, N);
        }
        bw.write(String.valueOf(max*min));
        br.close();
        bw.flush();
        bw.close();
    }

    
}
