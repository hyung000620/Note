import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++){
            int tmp = Integer.parseInt(st.nextToken());
            solution(tmp);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : map.keySet()){
            if(map.get(x)==n){
                list.add(x);
            }
        }
        Collections.sort(list);

        for(int i : list){
            sb.append(i).append('\n');
        }

        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
    public static void solution(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }
    }
    
}
