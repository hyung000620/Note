import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int solv = Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine()," ");
       
       int tmp = 0;
       for(int i=0; i<5; i++){
            if(solv == Integer.parseInt(st.nextToken())){
                tmp ++;
            }
       }

       System.out.println(tmp);
    }
}
