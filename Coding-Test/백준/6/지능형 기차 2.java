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
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());
            sum += in-out;
            max = Math.max(sum, max);
        }
        bw.write(String.valueOf(max));

        br.close();
        bw.flush();
        bw.close();

    }
}
