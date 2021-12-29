import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine())*30;
        int D = Integer.parseInt(br.readLine());

        int sum = M+D;
        if(sum==78){
            System.out.println("Special");
        }else if(sum<78){
            System.out.println("Before");
        }else{
            System.out.println("After");
        }
    }
}
