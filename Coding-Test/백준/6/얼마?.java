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
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int s = Integer.parseInt(br.readLine());
            
            int t = Integer.parseInt(br.readLine());
            for(int j=0; j<t; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int q = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());

                s += (q*p);
            }
            
            arr[i] = s;
        }
        
        for(int i : arr){
            bw.write(String.valueOf(i));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
    
}
