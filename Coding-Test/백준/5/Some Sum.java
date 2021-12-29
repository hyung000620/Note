import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        if(N%4==0){
            System.out.println("Even");
            System.exit(0);
        }

        String str = N%2==0?"Odd":"Either";
        System.out.println(str);
        
    }
}
