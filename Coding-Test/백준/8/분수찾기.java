import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int cross = 1, preSum = 0;
        while(true){
            if(X<=cross+preSum){
                if(cross %2 == 1){
                    System.out.print((cross - (X-preSum-1))+"/"+(X-preSum));
                    break;
                }else{
                    System.out.print((X-preSum)+"/"+(cross - (X-preSum-1)));
                    break;
                }
            }else{
                preSum += cross;
                cross ++;
            }
        }
    }
}
