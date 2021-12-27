import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n%2!=0){
            System.out.println(0);
            System.exit(0);
        }

        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
        }
        
        sum = sum%2==0?2:1;

        System.out.println(sum);
    }
}
