import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        String[] coin = {"TTT","TTH","THT","THH","HTT","HTH","HHT","HHH"};
        
        StringBuilder sb = new StringBuilder();
        while(N-->0){
            int[] num = {0,0,0,0,0,0,0,0};
            String str = br.readLine();
            for(int i=0; i< str.length()-2; i++){
                String s = str.substring(i, i+3);
                for(int j=0; j<8; j++){
                    if(s.equals(coin[j])){
                        num[j]++;
                    }
                }    
            }
            for(int i=0; i<8; i++){
                sb.append(num[i]).append(" ");
            }
            sb.append('\n');
        }

        bw.write(sb.toString());
        
        bw.flush();

        bw.close();
    }
    
}
