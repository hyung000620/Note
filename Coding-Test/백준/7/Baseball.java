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

        StringBuilder sb = new StringBuilder();
        
        while(N-->0){
            int Y =0;
            int K =0;
            
            for(int i=0; i<9; i++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                Y += Integer.parseInt(st.nextToken());
                K += Integer.parseInt(st.nextToken());
            }

            if(Y==K){
                sb.append("Draw").append('\n');
            }else if(Y>K){
                sb.append("Yonsei").append('\n');
            }else{
                sb.append("Korea").append('\n');
            }

        }

        bw.write(sb.toString());

        br.close();
        

        bw.flush();
        bw.close();
    }
}
