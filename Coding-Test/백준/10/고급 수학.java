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

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<=n; i++){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            Arrays.sort(arr);

            sb.append("Scenario #").append(i).append(":").append('\n');

            if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]){
                sb.append("yes").append('\n')
                .append('\n');
            }else{
                sb.append("no").append('\n')
                .append('\n');
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
}
