import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        
        int[] coins = new int[n];
        for(int i=0; i<n; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        
        int cnt = 0;
        
        for(int i=n-1; i>=0;i--){
            if(coins[i] <= money){
                cnt += money/coins[i];
                money = money% coins[i];
            }
        }
        System.out.println(cnt);
        
    }
}
