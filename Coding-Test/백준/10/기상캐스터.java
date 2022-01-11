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
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        for(int i=0; i<H; i++){
            char[] arr = br.readLine().toCharArray();
            for(int j=0; j<W; j++){
                char c = arr[j];
                if(c == '.' && cnt == 0){
                    sb.append("-1 ");
                }else if(c == 'c'){
                    sb.append("0 ");
                    cnt = 1;
                }else if(c == '.' && cnt != 0){
                    sb.append(cnt+" ");
                    cnt++;
                }
                
            }
            cnt = 0;
            sb.append('\n');
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    
}
