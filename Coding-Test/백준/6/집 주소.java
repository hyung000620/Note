import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        StringBuilder sb = new StringBuilder();
        
        while(true){
            int tmp = 0;

            char[] arr = br.readLine().toCharArray();
            
            if(arr[0]=='0') break;

            tmp += arr.length+1;

            for(int i=0; i<arr.length; i++){
                if(arr[i] == '1'){
                    tmp +=2;
                }else if(arr[i] == '0'){
                    tmp += 4;
                }else{
                    tmp += 3;
                }
            }
            sb.append(tmp).append('\n');
        }
        
        System.out.print(sb);
    }
}
