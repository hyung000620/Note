import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i=5; i>=1; i--){
            if(n>=i){
                cnt += n/i;
                n = n%i;
            }
        }
        System.out.println(cnt);
    }
}
