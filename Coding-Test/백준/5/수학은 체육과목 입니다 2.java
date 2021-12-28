import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 1;
        int change = -1;

        for(int i=1; i<n; i++){
            if(cnt<=1){
                change *=-1;
            }
            cnt += change;
            if(cnt>=5){
                change *= -1;
            }
        }

        System.out.println(cnt);
    }
}수학은 체육과목 입니다 2
