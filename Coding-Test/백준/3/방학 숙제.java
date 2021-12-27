import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int L = Integer.parseInt(br.readLine());
       
       double A = Double.parseDouble(br.readLine()); // 국어
       double B = Double.parseDouble(br.readLine()); // 수학
       double C = Double.parseDouble(br.readLine()); // 국어
       double D = Double.parseDouble(br.readLine()); // 수학
       
       double sum = (A/C)>(B/D)?(A/C):(B/D);
       
       int tmp = (int)Math.ceil(sum);
       System.out.println(L-tmp);
    }
}
