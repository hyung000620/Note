import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = Arrays.stream(br.readLine().split(",")).mapToInt(Integer :: parseInt).sum();
        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
