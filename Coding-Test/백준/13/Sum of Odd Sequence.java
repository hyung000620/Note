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

        StringBuilder sb = new StringBuilder();
        
        while(N-->0){
            int tmp = Integer.parseInt(br.readLine());
            int sum = 0;
            for(int i=0; i<=tmp; i++){
                if(i%2==1){
                    sum+=i;
                }
            }
            sb.append(sum).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}
