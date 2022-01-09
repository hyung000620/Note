import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        BigInteger A = new BigInteger(st.nextToken(),2);
        BigInteger B = new BigInteger(st.nextToken(),2);

        String result = A.add(B).toString(2);

        bw.write(result);

        br.close();
        bw.flush();
        bw.close();
    }

    
}
