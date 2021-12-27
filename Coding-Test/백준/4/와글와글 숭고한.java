import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        if(s+k+h>=100){
            System.out.println("OK");
            System.exit(0);
        }
        
        HashMap<Integer,String> map = new HashMap<>();
        map.put(s, "Soongsil");
        map.put(k,"Korea");
        map.put(h,"Hanyang");

        Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);
        
        System.out.println(map.get(mapkey[0]));
        
    }    
}
