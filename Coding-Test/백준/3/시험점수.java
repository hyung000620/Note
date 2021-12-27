import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int sum =0;
       for(int i=0; i<2; i++){
           StringTokenizer st = new StringTokenizer(br.readLine()," ");
           int tmp = 0;
           for(int j=0; j<4; j++){
               tmp += Integer.parseInt(st.nextToken());
           }
           sum = Math.max(sum, tmp);
       }

       System.out.println(sum);
    }
}
