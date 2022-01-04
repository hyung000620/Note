import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        while(N-->0){
            int sum = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).sum();
            sb.append(sum).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
