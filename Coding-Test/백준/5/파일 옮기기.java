import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken()); //사과
        int B = Integer.parseInt(st.nextToken()); //오렌지

        st = new StringTokenizer(br.readLine()," ");
        int C = Integer.parseInt(st.nextToken()); //사과
        int D = Integer.parseInt(st.nextToken()); //오렌지


        int result = Math.min(A+D,B+C);

        System.out.println(result);
    }
}
