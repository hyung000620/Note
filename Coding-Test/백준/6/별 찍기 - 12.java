import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            for(int j=n-i-1; j>0; j--){
                sb.append(" ");
            }
            for(int j =0; j<i+1; j++){
                sb.append("*");
            }
            sb.append('\n');
        }
        for(int i=n-2; i>=0; i--){
            for(int j=n-i-1; j>0; j--){
                sb.append(" ");
            }
            for(int j =0; j<i+1; j++){
                sb.append("*");
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
