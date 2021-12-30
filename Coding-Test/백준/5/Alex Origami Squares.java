import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double H = Double.parseDouble(st.nextToken());
        double W = Double.parseDouble(st.nextToken());
        
        double A = Math.max(H, W);
        double B = Math.min(H, W);

        double l1 = A/3<=B?A/3:B;
        double l2 = B/2;

        double result = Math.max(l1, l2);
        System.out.println(result);
    }
}
