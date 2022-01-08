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

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken())-1;
        int y = Integer.parseInt(st.nextToken())-1;

        int xw = x/4;
        int yw = y/4;
        

        int xh = x%4;
        int yh = y%4;


        int result = Math.abs(xw-yw)+Math.abs(xh-yh);
        bw.write(String.valueOf(result));
        bw.close();
        br.close();
    }
    
}
