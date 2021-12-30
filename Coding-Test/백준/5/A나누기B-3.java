import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        
        BigInteger C = A.divide(B);
        BigInteger D = A.remainder(B);

        if(BigInteger.ZERO.compareTo(B) !=0 && BigInteger.ZERO.compareTo(A) == 1 && BigInteger.ZERO.compareTo(B) == -1){
            
            System.out.println(C.subtract(BigInteger.ONE));
            System.out.println(A.subtract(C.subtract(BigInteger.ONE).multiply(B)));
        }else if(BigInteger.ZERO.compareTo(A) == 1 && BigInteger.ZERO.compareTo(B) == 1){
            System.out.println(C.add(BigInteger.ONE));
            System.out.println(A.subtract(C.add(BigInteger.ONE).multiply(B)));
        }else{
            System.out.println(C);
            System.out.println(D);
        }
    }
}
