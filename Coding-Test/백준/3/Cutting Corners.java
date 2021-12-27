import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine()," ");
       int w = Integer.parseInt(st.nextToken());
       int h = Integer.parseInt(st.nextToken());
       double answer = (w+h)-Math.sqrt(Math.pow(w,2)+Math.pow(h,2));
       
       if(answer%1 != 0){
        String str = String.format("%.9f", answer);
        System.out.println(str);
       }else{
        System.out.println((int)answer);
       }
       
    }
}
