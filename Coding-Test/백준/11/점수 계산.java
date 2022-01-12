import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer[] arr = new Integer[8];

        for(int i=0; i<8; i++){
            int tmp = Integer.parseInt(br.readLine());
            arr[i] = tmp;
            map.put(tmp, i+1);
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        int[] arr2 = new int[5];
        for(int i=0; i<5; i++){
            int tmp = arr[i];
            sum += tmp;
            arr2[i] = map.get(tmp);
        }
        Arrays.sort(arr2);
        for(int i : arr2){
            sb.append(i+" ");
        }
        bw.write(String.valueOf(sum));
        bw.newLine();
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    
}
