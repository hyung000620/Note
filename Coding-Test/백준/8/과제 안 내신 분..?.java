import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<28; i++){
            int tmp = Integer.parseInt(br.readLine());
            map.put(tmp, map.getOrDefault(tmp, 0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=30; i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0)).append('\n')
        .append(list.get(1));

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
