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
        int n = Integer.parseInt(br.readLine());

        int p1 = 100;
        int p2 = 100;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int r1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            if(r1 > r2){
                p2 -= r1;
            }else if(r1 < r2){
                p1 -= r2;
            }
        }
        bw.write(String.valueOf(p1));
        bw.newLine();
        bw.write(String.valueOf(p2)); 

        br.close();
        bw.flush();
        bw.close();
    }
    
}
