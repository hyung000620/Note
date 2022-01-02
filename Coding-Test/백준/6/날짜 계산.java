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

        // 범위 (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
        int e=1,s=1,m=1;
        int E = Integer.parseInt(st.nextToken()); // 지구를 나타내는 수
        int S = Integer.parseInt(st.nextToken()); // 태양을 나타내는 수
        int M = Integer.parseInt(st.nextToken()); // 달을 나타내는 수
        
        for(int cnt=1;;cnt++){
            if(e==E && s==S && m ==M){
                bw.write(String.valueOf(cnt));
                break;
            }
            e++;
            s++;
            m++;
            if(e == 16) e=1;
            if(s == 29) s=1;
            if(m == 20) m=1;
        }

        bw.flush();
        bw.close();
    }
}
