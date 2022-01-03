import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        
        for(int i=0; i<3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', arr[0]);
        map.put('B', arr[1]);
        map.put('C', arr[2]);

        char[] c = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch : c){
            sb.append(map.get(ch)).append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
