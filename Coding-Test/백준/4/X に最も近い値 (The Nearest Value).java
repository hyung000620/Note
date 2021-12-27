import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int X = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        
        HashMap<Integer,Integer> map = new HashMap<>();

        int tmp = R+10000000;
        for(int i=L; i<=R; i++){
            map.put(i, Math.abs(X-i));
        }
        int answer = 0; 
        for(int i=L; i<=R; i++){
            if(map.get(i) <tmp){
                tmp = map.get(i);
                answer = i;
            }
        }

        System.out.println(answer);
    }    
}
