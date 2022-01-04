import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c-3<'A'){
                sb.append((char)(c+23));
            }else{
                sb.append((char)(c-3));
            }

        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
