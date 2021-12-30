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
        int sum = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).sum();
        bw.write(String.valueOf(sum));

        br.close();
        bw.flush();
        bw.close();

    }
}
