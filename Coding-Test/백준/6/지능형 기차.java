import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int answer = 0;
        for(int i=0; i<4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            sum += in-out;
            answer = Math.max(sum,answer);
        }

        System.out.println(answer);
    }
}
