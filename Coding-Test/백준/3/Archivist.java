import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int n = Integer.parseInt(br.readLine());
       if(n == 1996 || n == 1997 || n == 2007 || n == 2008 || n == 2013 || n == 2018 || n == 2000){
           System.out.println("SPbSU");
       }else if(n == 2006){
           System.out.println("PetrSU, ITMO");
       }else{
            System.out.println("ITMO");
       }

    }
}
