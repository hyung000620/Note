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
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        
        double M = (B-A)/400;

        double result = 1/(1+Math.pow(10, M));
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }

    
}
