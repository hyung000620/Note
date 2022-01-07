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

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            
            int cnt = 0;

            for(int i=0; i<N; i++){
                int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
                if(arr[0]*arr[1]/arr[2]>=D){
                    cnt++;
                }
            }
            sb.append(String.valueOf(cnt)).append('\n');
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
}
