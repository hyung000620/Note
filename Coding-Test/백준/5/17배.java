import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        BigInteger N = new BigInteger("0");
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='1'){
                N = N.add(new BigInteger("2").pow(str.length()-(i+1)));
            }else if(str.charAt(i) == '0'){
                N = N.add(new BigInteger("0"));
            }else if(str.equals("0")){
                System.out.println("0");
                System.exit(0);
            }
        }

        BigInteger result = N.multiply(new BigInteger("17"));
        String last = "";
        while(result != BigInteger.valueOf(0)){
            last += result.mod(BigInteger.valueOf(2));
            result  = result.divide(BigInteger.valueOf(2));
        }

        String answer = new StringBuilder(last).reverse().toString();
        System.out.println(answer);
    }
}
