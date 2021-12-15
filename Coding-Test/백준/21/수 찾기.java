import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        for(int i=0; i<N; i++){
            int key = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key,0)+1);
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            int key = Integer.parseInt(st.nextToken());
            if(map.containsKey(key)) sb.append(1).append('\n');
            else sb.append(0).append('\n');
        }
        System.out.println(sb);
    }
}
