import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        char c = input.charAt(0);
        int sum = 10;
        for(int i=1; i<input.length(); i++){
            if(input.charAt(i-1) == input.charAt(i)){
                sum +=5;
            }else{
                sum +=10;
            }
        }
        bw.write(String.valueOf(sum));
        br.close();
        bw.flush();
        bw.close();
    }

    
}
