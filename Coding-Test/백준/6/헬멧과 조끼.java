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
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int N_MAX = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer :: parseInt)
        .max()
        .getAsInt();


        int M_MAX = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer :: parseInt)
        .max()
        .getAsInt();

        br.close();

        int result = N_MAX + M_MAX;

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}
