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
        
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int d = Integer.parseInt(st.nextToken()); // 병렬 버전을 개발하는데 걸리는 시간
            int n = Integer.parseInt(st.nextToken()); // 프로그램이 실행되는 횟수
            int s = Integer.parseInt(st.nextToken()); // 직렬버전의 실행 시간
            int p = Integer.parseInt(st.nextToken()); // 병렬버전의 실행 시간
            
            // 직렬
            int S = s*n;
            // 병렬
            int P = p*n+d;

            if(S==P){
                sb.append("does not matter").append('\n');
            }else if(S>P){
                sb.append("parallelize").append('\n');
            }else{
                sb.append("do not parallelize").append('\n');
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
