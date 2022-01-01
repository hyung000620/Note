import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split("-");
        
        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s.charAt(0));
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
