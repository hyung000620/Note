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

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int Y = 0; // 영식
        int M = 0; // 민식
        for(int i=0; i<N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            Y += ((tmp/30)+1)*10;
            M += ((tmp/60)+1)*15;
        }
        if(Y==M){
            bw.write("Y M "+Y);
        }else if(Y>M){
            bw.write("M "+M);
        }else{
            bw.write("Y "+Y);
        }

        br.close();
        

        bw.flush();
        bw.close();
    }
}
