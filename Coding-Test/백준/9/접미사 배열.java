import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            String tmp = s.substring(i);
            list.add(tmp);
        }

        Collections.sort(list);

        for(String t : list){
            sb.append(t).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
