import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int W = Integer.parseInt(st.nextToken()); // 상대방의 허리 높이
        int N = Integer.parseInt(st.nextToken()); // 목 높이
        int P = Integer.parseInt(st.nextToken()); // 펀치 수

        int cnt = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<P; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp >=W && tmp <=N){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
