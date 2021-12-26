import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());

		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());

		System.out.println(A.multiply(B));
    }
}
