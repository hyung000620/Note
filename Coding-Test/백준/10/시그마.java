import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
* @가우스 시그마 공식 이용
*
**/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," "); 

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        
        if(B>A){
            long tmp = A;
            A = B;
            B = tmp;
        }

        long result = (A+B)*(A-B+1)/2;
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
    
}
