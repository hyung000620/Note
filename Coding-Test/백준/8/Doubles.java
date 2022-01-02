import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();

        while(true){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            
            if(arr[0] == -1) break;
            
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<arr.length-1; i++){
                list.add(arr[i]*2);
            }

            int cnt = 0;
            for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<list.size(); j++){
                    if(arr[i] == list.get(j)){
                        cnt++;
                    }
                }
            }
            
            sb.append(cnt).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
