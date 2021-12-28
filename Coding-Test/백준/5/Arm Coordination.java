import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int r = Integer.parseInt(br.readLine());
    
        StringBuilder sb = new StringBuilder();

        sb.append(x-r).append(" ").append(y+r).append('\n');
        sb.append(x+r).append(" ").append(y+r).append('\n');
        sb.append(x+r).append(" ").append(y-r).append('\n');
        sb.append(x-r).append(" ").append(y-r).append('\n');

        System.out.println(sb);
    }
}
