import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int[] dp = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<=10; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++){
            int tmp = Integer.parseInt(br.readLine());
            sb.append(dp[tmp]).append('\n');
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
}
