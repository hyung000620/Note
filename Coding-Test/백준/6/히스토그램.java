import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while(T-->0){
            int k = Integer.parseInt(br.readLine());
            for(int i=0; i<k; i++){
                sb.append("=");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
