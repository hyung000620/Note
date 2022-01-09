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
        
        char[] arr = br.readLine().toCharArray();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            char tmp = arr[A];
            arr[A] = arr[B];
            arr[B] = tmp;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            sb.append(c);
        }

        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    
}
