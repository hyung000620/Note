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
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());

        for(int i=1; i<=K; i++){

            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            for(int j=0; j<N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            
            int gap = 0;
            
            for(int j=0; j<N-1; j++){
                gap = Math.max(gap, arr[j+1] - arr[j]);
            }
            sb.append("Class ").append(i).append('\n')
            .append("Max ").append(arr[N-1]).append(", ")
            .append("Min ").append(arr[0]).append(", ")
            .append("Largest gap ").append(gap).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
