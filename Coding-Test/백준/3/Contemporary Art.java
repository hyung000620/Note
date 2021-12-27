import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       double n = Double.parseDouble(br.readLine());
       n = Math.sqrt(n)*4;
       if(n%1 == 0){ 
        System.out.println(n);
       }else{
           System.out.println(String.format("%.8f", n));
       }
    }
}
