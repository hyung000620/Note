import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        HashMap<Character, Integer> map = new HashMap<>();
        while(T-->0){
            char c = br.readLine().charAt(0);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        StringBuilder sb = new StringBuilder();
        for(char c : map.keySet()){
            if(map.get(c)>=5){
                sb.append(c);
            }
        }

        if(sb.length() == 0){
            sb.append("PREDAJA");
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
