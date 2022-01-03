import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Blob;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(N-->0){
            int V = Integer.parseInt(br.readLine());

            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<V; i++){
                int key = Integer.parseInt(br.readLine());
                map.put(key, map.getOrDefault(key, 0)+1);
            }

            int maxValue = Collections.max(map.values());
            
            int result = Integer.MAX_VALUE;
            for(int i : map.keySet()){
                if(map.get(i) == maxValue){
                    result = Math.min(result, i);
                }
            }

            sb.append(result).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
