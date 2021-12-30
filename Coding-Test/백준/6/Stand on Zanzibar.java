import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            int tmp = 0;
            int cnt = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>tmp*2 && tmp !=0){
                    cnt += arr[i] - (tmp*2);
                }
                tmp = arr[i];
            }
            sb.append(cnt).append('\n');
            
        }

        System.out.println(sb);
    }
}
