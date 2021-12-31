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
        
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int[] arr = new int[8];
            for(int i=0; i<8; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for(int i= 0; i<4; i++){
                arr[i] += arr[i+4];
                arr[i+4] = 0;
            }
            arr[0] = (arr[0]<1)?1:arr[0];
            arr[1] = (arr[1]<1)?1:arr[1];
            arr[2] = (arr[2]<0)?0:arr[2];
            arr[3] *=2; 
            arr[2] *=2;
            arr[1] *=5; 
            int sum = Arrays.stream(arr).sum();
            sb.append(sum).append('\n');
        }
        
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
