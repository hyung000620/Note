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
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int gcd = GCD(N, M); // 최대 공약수
            int k = N*M/gcd; // 최소 공배수

            sb.append(k).append(" ").append(gcd).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int GCD(int a, int b){ // 최대 공약수
        if(a%b == 0){
            return b;
        }
        return GCD(b, a%b);
    }
    
}
