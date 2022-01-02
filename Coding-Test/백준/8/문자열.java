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

        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            String s = br.readLine();
            if(s.length() == 1){
                sb.append(s).append(s).append('\n');
            }else{
                sb.append(s.charAt(0)).append(s.charAt(s.length()-1)).append('\n');
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
