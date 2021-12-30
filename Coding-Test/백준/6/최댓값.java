import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int row = 0;
        int col = 0;
        int max = 0;
        for(int i=1; i<=9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=1; j<=9; j++){
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp>max){
                    max = tmp;
                    row = i;
                    col = j;
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(row+" "+col);

        br.close();
        bw.flush();
        bw.close();

    }
}
