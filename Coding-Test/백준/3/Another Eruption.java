import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       double n = Double.parseDouble(br.readLine());
       
       double r = Math.sqrt((n/Math.PI));
       
       double answer = 2*r*Math.PI;
       
       String str = String.format("%.9f", answer);
       System.out.println(str);
    }
}
