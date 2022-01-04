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
        
        char[] ch = br.readLine().toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        char[] arr = "CAMBRIDGE".toCharArray();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<ch.length; i++){
            if(!map.containsKey(ch[i])){
                sb.append(ch[i]);
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
    
}
