import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double N = Double.parseDouble(st.nextToken());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());
        double D = Double.parseDouble(st.nextToken());
        double sum = 0;

  
        sum = Math.min(Math.ceil(N/A)*B,Math.ceil(N/C)*D);
           
        
        System.out.println((int)sum);
    }
}
