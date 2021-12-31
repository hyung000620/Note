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
        StringBuilder sb = new StringBuilder();

        while(true){
            int N = Integer.parseInt(br.readLine());
            int mary = 0;
            int john = 0;
            if(N==0) break;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int i=0; i<N; i++){
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp == 0) mary++;
                else john++;
            }
            sb.append("Mary won ").append(mary)
            .append(" times and John won ").append(john)
            .append(" times").append('\n');
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
