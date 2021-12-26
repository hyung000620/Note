import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       if(str.isEmpty() || str == null){
           System.out.println(-1);
           System.exit(0);
       }
       StringTokenizer st = new StringTokenizer(str," ");

       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       
       if(A-B<0 || (A-B)%2!=0){
        System.out.println(-1);
        System.exit(0);
        }
       StringBuilder sb = new StringBuilder();

       sb.append((A+B)/2)
       .append(" ")
       .append((A-B)/2);

       System.out.println(sb);
    }
}
