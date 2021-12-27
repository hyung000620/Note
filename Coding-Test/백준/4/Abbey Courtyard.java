import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        
        double result = Math.sqrt(a)*4;
        if(result%1==0){
            System.out.println(result);
        }else{
            System.out.printf("%.8f",result);
        }
    }    
}
