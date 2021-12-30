import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int cnt = 1;
        for(int i=0; i<N; i++){
            if(arr[i] == 1){
                sum += cnt;
                cnt++;
            }
            if(arr[i] == 0){
                cnt = 1;
            }
        }

        bw.write(String.valueOf(sum));

        br.close();
        bw.flush();
        bw.close();

    }
}
