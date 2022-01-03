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
        StringBuilder sb = new StringBuilder();

        while(true){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).sorted().toArray();
            if(arr[0] == 0 && arr[1] == 0) break;

            if(arr[0]+arr[1]<=arr[2]){
                sb.append("Invalid").append('\n');
            }else if(arr[0] == arr[1] && arr[1] == arr[2]){
                sb.append("Equilateral").append('\n');
            }else if(arr[0] == arr[1] || arr[1] == arr[2]){
                sb.append("Isosceles").append('\n');
            }else{
                sb.append("Scalene").append('\n');
            }

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
