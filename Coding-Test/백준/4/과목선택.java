import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int tmp = 101;
        for(int i=0; i<4; i++){
            int score= Integer.parseInt(br.readLine());
            n += score;
            if(tmp >score){
                tmp = score;
            }
        }
        n -= tmp;
        tmp =0;
        for(int i=0; i<2; i++){
            int score= Integer.parseInt(br.readLine());
            if(tmp<score){
                tmp = score;
            }
        }
        n += tmp;
        System.out.println(n);
    }
}
