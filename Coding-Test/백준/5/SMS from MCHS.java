import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        // 오늘
        int t1 = Integer.parseInt(st.nextToken());
        int v1 = Integer.parseInt(st.nextToken());

        // 내일
        st = new StringTokenizer(br.readLine()," ");
        int t2 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        if(t2<0 && v2>=10){
            System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
            System.exit(0);
        }else if(t2<t1){
            System.out.println("MCHS warns! Low temperature is expected tomorrow.");
            System.exit(0);
        }else if(v2>v1){
            System.out.println("MCHS warns! Strong wind is expected tomorrow.");
            System.exit(0);
        }else{
            System.out.println("No message");
        }
    }
}
