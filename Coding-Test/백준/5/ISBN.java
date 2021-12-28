import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        for(int i=0; i<3; i++){
            int tmp = Integer.parseInt(br.readLine());
            if(i%2 == 0){
                sum += tmp*1;
            }else{
                sum += tmp*3;
            }
        }
        sum+= 91;
        System.out.println("The 1-3-sum is "+sum);
    }
}
