import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        
        int result = sum*5 - 24;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        
    }
    
}
