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
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        Arrays.sort(arr);
        int result = arr[0]*arr[2];
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }

    
}
