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
        int P = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(P-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken()); // 테스트 케이스의 번호
            float D = Float.parseFloat(st.nextToken()); // 철로의 길이
            float A = Float.parseFloat(st.nextToken()); // A 기차 속도
            float B = Float.parseFloat(st.nextToken()); // B 기차 속도
            float F = Float.parseFloat(st.nextToken()); // 파리의 속도

            String str = String.format("%.6f", D/(A+B)*F);
            sb.append(N).append(" ").append(str).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
