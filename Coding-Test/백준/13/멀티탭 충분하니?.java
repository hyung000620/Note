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
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];

        int sum = 0;
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<k; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] % 2 == 0){
                sum += arr[i]/2;
            }else{
                sum += (arr[i]/2)+1;
            }
        }

        String str = sum>=n?"YES":"NO";
        bw.write(str);
        bw.flush();
        bw.close();
        
    }
    
}
