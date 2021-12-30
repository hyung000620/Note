import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int max = 0;
        int cnt = 0;
        for(int i=0; i<5; i++){
            int tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).sum();
            if(tmp>max){
                max = tmp;
                cnt = i;
            }
        }
        bw.write(String.valueOf(cnt+1));
        bw.write(" ");
        bw.write(String.valueOf(max));

        br.close();
        bw.flush();
        bw.close();

    }
}
