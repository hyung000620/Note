import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main{
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger m = new BigInteger(st.nextToken());
		BigInteger n = new BigInteger(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append(m.divide(n)).append('\n');
        sb.append(m.remainder(n)).append('\n');
        
        System.out.println(sb);
    }
}
