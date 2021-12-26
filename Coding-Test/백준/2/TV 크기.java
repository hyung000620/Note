import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine()," ");
       
       int D = Integer.parseInt(st.nextToken()); // 대각선 길이
       int H = Integer.parseInt(st.nextToken()); // 높이 비율
       int W = Integer.parseInt(st.nextToken()); // 너비 비율
       
       double a = Math.pow(D,2);
       double b = Math.pow(H,2)+Math.pow(W,2);
       double c = Math.sqrt(a/b);

       StringBuilder sb = new StringBuilder();

       sb.append((int)Math.floor(H*c)).append(" ").append((int)Math.floor(W*c)); 
       System.out.println(sb);
    }
}
