import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int minBugger = 2000;
       int minCoke = 2000;
       for(int i=0; i<3; i++){
           int tmp = Integer.parseInt(br.readLine());
           if(tmp<minBugger){
               minBugger = tmp;
           }
       }

       for(int i=0; i<2; i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp<minCoke){
                minCoke = tmp;
            }
       }

       int answer = minBugger+minCoke-50;

       System.out.println(answer);
    }
}
