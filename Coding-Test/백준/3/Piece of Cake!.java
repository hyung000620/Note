import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine()," ");
       int n = Integer.parseInt(st.nextToken());
       int h = Integer.parseInt(st.nextToken());
       int v = Integer.parseInt(st.nextToken());
       
       int sum = Math.max(Math.max(h*v,(n-h)*v),Math.max(h*(n-v),(n-h)*(n-v)));
       System.out.println(sum*4);
    }
}
