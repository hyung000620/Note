import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int sum = 0;
        int result = 0;
        for(int i=1; i<=T; i++){
            int tmp = Integer.parseInt(st.nextToken());
            result = tmp*i-sum;
            sum += result;
            sb.append(result).append(" ");
        }

        System.out.print(sb);
    }
}
