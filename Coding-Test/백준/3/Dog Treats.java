import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int S = Integer.parseInt(br.readLine());
       int M = Integer.parseInt(br.readLine())*2;
       int L = Integer.parseInt(br.readLine())*3;
        
       int sum = S+M+L;
       if(sum >=10){
           System.out.println("happy");
       }else{
           System.out.println("sad");
       }
    }
}
