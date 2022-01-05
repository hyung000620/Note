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
        
        
        int[] arr = new int[9];
        int sum =0, sA = 0, sB = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(sum - arr[i] -arr[j] == 100){
                    sA = arr[i];
                    sB = arr[j];
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != sA && arr[i] != sB ){
                sb.append(arr[i]).append('\n');
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
