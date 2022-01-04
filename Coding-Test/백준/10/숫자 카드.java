import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            int key = Integer.parseInt(st.nextToken());
            map.put(key, 1);
        }

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<M; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(map.containsKey(tmp)){
                sb.append(1+" ");
            }else{
                sb.append(0+" ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
