import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        if(T%10!=0){
            System.out.println(-1);
            System.exit(0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(T/300).append(" ");
        T %=300;
        sb.append(T/60).append(" ");
        T %=60;
        sb.append(T/10);
        
        System.out.println(sb);
    }
}
