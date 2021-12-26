import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine()," ");

       int A = Integer.parseInt(st.nextToken());
       int I = Integer.parseInt(st.nextToken());

       int answer = (A*I)-(A-1);
       System.out.println(answer);
    }
}
