import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] q = new int[n*2];

        for(int i=1; i<=n; i++){
            q[i] = i;
        }

        int preNum = 1;
        int lastNum = n;
        
        while(n-->1){
            preNum ++;
            q[lastNum+1] = q[preNum];
            lastNum++;
            preNum++;
        }
        System.out.println(q[preNum]);

    }
}
