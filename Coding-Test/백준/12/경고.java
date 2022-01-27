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
        String time1 = br.readLine();
        String time2 = br.readLine();
        
        if(time1.equals(time2)){
            bw.write("24:00:00");
        }
        else{
        int[] t1 = Arrays.stream(time1.split(":")).mapToInt(Integer :: parseInt).toArray();
        int[] t2 = Arrays.stream(time2.split(":")).mapToInt(Integer :: parseInt).toArray();

        int h = t2[0] - t1[0];
        int m = t2[1] - t1[1];
        int s = t2[2] - t1[2];

        if(s<0){
            s+=60;
            --m;
        }

        if(m<0){
            m+=60;
            --h;
        }

        if(h<0){
            h+=24;
        }

        bw.write(String.format("%02d:%02d:%02d", h,m,s));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
