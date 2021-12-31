import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        if(N==1){
            System.out.println(1);
            System.exit(0);
        }else{
            while(N>cnt){
                cnt *=2;
            }
            if(N == cnt){
                System.out.println(1);
                System.exit(0);
            }else{
                System.out.println(0);
                System.exit(0);
            }
        }
    }
}
