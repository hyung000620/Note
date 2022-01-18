import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        int sum = 1;
        int cnt = 2;
        for(int i=9; i<N; i+=3){
            sum += cnt;
            cnt++;
        }
        bw.write(String.valueOf(sum));
        br.close();
        bw.flush();
        bw.close();
    }
}
