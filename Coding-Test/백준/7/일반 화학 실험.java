import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        ArrayList<Float> list = new ArrayList<>();
        while(true){
            float t = Float.parseFloat(br.readLine());
            if(t == 999) break;
            list.add(t);
        }

        for(int i=0; i<list.size()-1; i++){
            float tmp = list.get(i+1)-list.get(i);
            sb.append(String.format("%.2f", tmp)).append('\n');
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
