import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int min = Integer.MAX_VALUE;
            int sum = 0;
            for(int i=0; i<7; i++){
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp%2 == 0){
                    sum += tmp;
                    min = Math.min(min,tmp);
                }
            }
            sb.append(sum).append(" ").append(min).append('\n');
        }

        System.out.print(sb);
    }
}
