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
        
        int[] arr = Arrays.stream(br.readLine().split(":")).mapToInt(Integer :: parseInt).toArray();

        int g = gcd(arr[0], arr[1]);

        arr[0]/=g;
        arr[1]/=g;

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(":")
        .append(arr[1]);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    public static int gcd(int a, int b){
        if(a%b==0) return b;
        else{
            return gcd(b,a%b);
        }
    }
}
