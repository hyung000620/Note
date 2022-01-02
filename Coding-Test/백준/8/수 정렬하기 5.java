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
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for(int i : arr){
            sb.append(i).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
