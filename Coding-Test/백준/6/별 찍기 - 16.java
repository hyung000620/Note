import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            for(int j=T-i-1; j>0; j--){
                bw.write(' ');
            }
            for(int j=T-i-1; j<T; j++){
                bw.write('*');
                bw.write(" ");
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
