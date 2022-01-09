import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        while(true){
            String str = br.readLine();
            
            if(str.equals("#")) break;
            int sum = 0;
            for(int i=1; i<=str.length(); i++){
                char c = str.charAt(i-1);
                if(c == ' '){
                    sum+= i*0;
                }else{
                    sum += (c-64)*i;
                }
            }
            sb.append(sum).append('\n');
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    
}
