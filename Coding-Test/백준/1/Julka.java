import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BigInteger A = new BigInteger(br.readLine());
       BigInteger B = new BigInteger(br.readLine());
       
       StringBuilder sb = new StringBuilder();

       sb
       .append((A.subtract(B)).divide(BigInteger.valueOf(2)).add(B))
       .append('\n')
       .append((A.subtract(B)).divide(BigInteger.valueOf(2)));

       System.out.println(sb);
    }
}
