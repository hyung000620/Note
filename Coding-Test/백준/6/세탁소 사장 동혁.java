import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int T = Integer.parseInt(br.readLine());
        int[] arr = {25,10,5,1};
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            int C = Integer.parseInt(br.readLine());

            for(int i=0; i<4; i++){
                if(C>=arr[i]){
                    sb.append(C/arr[i]).append(" ");
                }else{
                    sb.append(0).append(" ");
                }
                C = C%arr[i];
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
