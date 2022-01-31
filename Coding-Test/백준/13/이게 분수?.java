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

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        double[] arr = {
            ((double)A/C)+((double)B/D),
            ((double)C/D)+((double)A/B),
            ((double)D/B)+((double)C/A),
            ((double)B/A)+((double)D/C)
        };

        double max = Double.MIN_VALUE;
        int idx = 0;
        for(int i=0; i<4; i++){
            if(max<arr[i]){
                max = arr[i];
                idx = i;
            }
        }
        bw.write(String.valueOf(idx));
        bw.flush();
        bw.close();
        
    }
}
