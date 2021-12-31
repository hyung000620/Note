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
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        double W = Double.parseDouble(st.nextToken());
        double H = Double.parseDouble(st.nextToken());

        double max = Math.sqrt(Math.pow(W, 2)+Math.pow(H, 2));

        for(int i=0; i<N; i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp>max){
                bw.write("NE");
                bw.newLine();
            }else{
                bw.write("DA");
                bw.newLine();
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
    
}
