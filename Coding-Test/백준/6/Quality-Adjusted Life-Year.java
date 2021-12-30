import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        double sum = 0;
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            double q = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());

            sum += q*y;
        }

        System.out.printf("%.3f",sum);
    }
}
