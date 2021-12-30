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
        int N = Integer.parseInt(br.readLine());

        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int r = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int result = e-c-r;

            if(result == 0){
                bw.write("does not matter");
                bw.newLine();
            }else if(result >0){
                bw.write("advertise");
                bw.newLine();
            }else{
                bw.write("do not advertise");
                bw.newLine();
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
