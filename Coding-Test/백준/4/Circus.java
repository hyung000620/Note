import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       double n = Double.parseDouble(br.readLine());
       n = Math.sqrt(n/Math.PI);
       n = 2*n*Math.PI; 
       System.out.println(String.format("%.10f", n));
       
    }
}
