import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        int X = P*A;
        int Y = P>C?B+((P-C)*D):B;

        if(X>Y){
            System.out.println(Y);
        }else{
            System.out.println(X);
        }
    }    
}
