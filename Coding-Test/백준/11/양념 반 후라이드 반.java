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

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int sigle_menu = A+B;
        int set_menu = C+C;

        int sum = 0;

        if(sigle_menu>set_menu){
            if(X>Y){
                sum += Y*set_menu;
                sum += Math.min((X-Y)*A, (X-Y)*set_menu);
            }else{
                sum += X*set_menu;
                sum += Math.min((Y-X)*B, (Y-X)*set_menu);
            }
        }else{
            for(int i=0; i<X; i++) sum+=A;
            for(int i=0; i<Y; i++) sum+=B;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        
    }
}
