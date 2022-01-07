import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String test = "-\\(@?>&%";
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = br.readLine();
            
            if(s.equals("#")) break;
            int sum = 0, cnt = 0;
            
            for(int i = 0; i<s.length(); i++){
                char ch = s.charAt(i);
                int tmp = test.indexOf(ch);
                sum += tmp*Math.pow(8, s.length()-1-cnt);
                cnt++;
            }
            sb.append(String.valueOf(sum)).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
