import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int t1 = (11*24*60) + (11*60 )+ 11;
        int t2 = (D*24*60) + H*60 + M;
        int t = t2 - t1;
        if(t<0){
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(t);
    }
}
