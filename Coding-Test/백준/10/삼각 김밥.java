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
        double X = Double.parseDouble(st.nextToken());
        double Y = Double.parseDouble(st.nextToken()); //Y그램당 X원
        double seven = (1000/Y)*X;

        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            st = new StringTokenizer(br.readLine()," ");
            double Xi = Double.parseDouble(st.nextToken());
            double Yi = Double.parseDouble(st.nextToken());

            double resultN = (1000/Yi)*Xi;
            seven = Math.min(seven, resultN);
        }

        bw.write(String.format("%.2f", seven));
        bw.flush();
        bw.close();
    }
    
}
