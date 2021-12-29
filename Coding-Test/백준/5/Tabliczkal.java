import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());

        if(x%2 == 0 || y%2==0){
            System.out.println(0);
        }else{
            long result = Math.min(x,y);
            System.out.println(result);
        }
    }
}
