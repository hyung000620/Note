import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        double X = Double.parseDouble(st.nextToken());
        double Y = Double.parseDouble(st.nextToken());
        
        double sum = Math.ceil(X/(Y-X));

        
        System.out.println((int)sum+1);
    }
}
