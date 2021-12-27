import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int A = Integer.parseInt(br.readLine()); // 원래 고기 온도
        int B = Integer.parseInt(br.readLine()); // 목표 온도
        int C = Integer.parseInt(br.readLine()); // 얼어 있는 고기 데우는 시간
        int D = Integer.parseInt(br.readLine()); // 얼어 있는 고기 해동 시간
        int E = Integer.parseInt(br.readLine()); // 얼어 있지 않은 고기 데우는 시간
        int tmp = A;
        
        if(tmp<0){
            sum += 0-A*C;
            tmp = 0;
        }
        if(tmp == 0){
            sum += D;
        }
        if(tmp >= 0){
            sum += (B-tmp)*E;
        }    
        System.out.println(sum);
    }
}
