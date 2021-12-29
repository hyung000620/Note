import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("/");

        int K = Integer.parseInt(str[0]);
        int D = Integer.parseInt(str[1]);
        int A = Integer.parseInt(str[2]);

        if(K+A<D || D==0){
            System.out.println("hasu");
        }else{
            System.out.println("gosu");
        }
    }
}
