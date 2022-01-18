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
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int cnt = 0;
        int sum = 0;
        for(int i=0; i<N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(sum == tmp){
                cnt++;
                sum++;
            }
            if(sum == 3){
                sum =0;
            }
        }
        bw.write(String.valueOf(cnt));
        br.close();
        bw.flush();
        bw.close();
    }
}
