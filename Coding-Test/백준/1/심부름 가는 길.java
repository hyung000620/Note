import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int tmp = 0;
       for(int i=0; i<4; i++){
           tmp += Integer.parseInt(br.readLine());
       }
       StringBuilder sb = new StringBuilder();

       sb.append(tmp/60)
       .append('\n')
       .append(tmp%60);

       System.out.println(sb);
    }
}
