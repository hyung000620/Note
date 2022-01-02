import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int dm = (int)Math.sqrt(M);
        int dn = (int)Math.sqrt(N);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = dm; i<=dn; i++){
            if(i*i>=M && i*i<=N){
                list.add(i*i);
            }
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i : list){
            sum += i;
        }
        if(list.isEmpty()){
            bw.write(String.valueOf(-1));
        }else{
            sb.append(sum).append('\n')
            .append(list.get(0));
            bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }
}
