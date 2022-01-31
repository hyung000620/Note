import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int ans = 0;
        for(int i = 1; i<501; i++){
            for(int j= i; j<501; j++){
                if(i*i+N == j*j){
                    ans ++;
                }
            }
        }
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        
    }
}
