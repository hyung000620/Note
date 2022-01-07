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
            double N = Double.parseDouble(st.nextToken());
            double C = Double.parseDouble(st.nextToken());

            int result = (int)(Math.ceil(N/C));
            sb.append(result).append('\n');
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
}
