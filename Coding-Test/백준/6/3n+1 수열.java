import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        while(true){
            if(N==1) break;
            if(N%2==0){
                N /=2;
                cnt ++;
            }
            if(N==1) break;
            if(N%2!=0){
                N = 3*N+1;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
