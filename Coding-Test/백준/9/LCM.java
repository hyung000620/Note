import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Blob;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());

            long result = A*B/gcd(A, B);
            sb.append(result).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    public static long gcd(long a, long b){
        long mod;
        while((mod=a%b)>0){
            a = b;
            b = mod;
            mod = a%b;
        }
        return b;
    }
    
}
