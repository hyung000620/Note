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
        Main T = new Main();
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if(c==0 && d==0)break;

            int pt = T.ParsTel(c, d);
            int pc = T.ParsCell(c, d);
            int pp = T.ParsPhone(c, d);

            int result = Math.min(pp, Math.min(pt, pc));
            sb.append(result).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    public int ParsTel(int c, int d){
        return c*30 + d*40;
    }
    public int ParsCell(int c, int d){
        return c*35 + d*30;
    }
    public int ParsPhone(int c, int d){
        return c*40 + d*20;
    }
}
