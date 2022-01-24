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
        int result = 0;
        int diff1 = arr[1] - arr[0];
        int diff2 = arr[2] - arr[1]; 
        if(diff1 == diff2){
            result = diff2 + arr[2];
        }else if(diff1>diff2){
            result = arr[0]+ diff2;
        }else{
            result = arr[1] + diff1;
        }
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
}
