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
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T-->0){
           int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

           int sum = Math.abs(arr[3]-arr[0])+Math.abs(arr[4]-arr[1])+arr[2]+arr[5];
           sb.append(String.valueOf(sum)).append('\n'); 
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
