import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine()," ");
       
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int i=0; i<3; i++){
           int key = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key, 0)+1);
       }
       if(map.get(1) == null){
           System.out.println(2);
           System.exit(0);
       }
       if(map.get(2) == null){
        System.out.println(1);
        System.exit(0);
       } 
       int answer = map.get(1)>map.get(2)?1:2;

       System.out.println(answer);
    }
}
