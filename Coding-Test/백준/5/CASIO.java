import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        int answer = N==M?1:0;

        System.out.println(answer);
    }
}
