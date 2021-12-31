import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            int total_C = 0;
            float total_G = 0;
            for(int i=0; i<N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                int C = Integer.parseInt(st.nextToken());
                float G = Float.parseFloat(st.nextToken());
                total_C += C;
                total_G += G*C;
            }
            sb.append(total_C).append(" ").append(Math.round(total_G/total_C*10)/10.0)
            .append('\n');
        }
        System.out.print(sb);
    }
}
