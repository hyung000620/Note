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
        int sum = 0;
        int[] arr = new int[5];
        
        for(int i=0; i<5; i++){
            int tmp = Integer.parseInt(br.readLine());
            arr[i] = tmp;
            sum += tmp;
        }

        Arrays.sort(arr);
        sum /=5;

        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(sum)).append('\n')
        .append(String.valueOf(arr[2]));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
