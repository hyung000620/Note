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
        int N = Integer.parseInt(br.readLine());
        
        int max = Integer.MIN_VALUE;
        
        while(N-->0){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            
            if(arr[0] == arr[1] && arr[1] == arr[2]){
                int tmp = arr[0]*1000+10000;
                max = Math.max(max, tmp);
            }else if(arr[0] != arr[1] && arr[1] !=arr[2] && arr[0]!= arr[2]){
                Integer tmp = Arrays.stream(arr).max().getAsInt();
                tmp *=100;
                max = Math.max(max, tmp);
            }else{
                int tmp = 1000;
                if(arr[0] == arr[1] || arr[0] == arr[2]){
                    tmp += arr[0]*100;
                    max = Math.max(max, tmp);
                }else if(arr[2] == arr[1]){
                    tmp += arr[1]*100;
                    max = Math.max(max, tmp);
                }
            }
        }

        bw.write(String.valueOf(max));

        br.close();
        bw.flush();
        bw.close();
    }
}
