import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        ArrayList<Integer> garo = new ArrayList<Integer>();
        ArrayList<Integer> sero = new ArrayList<Integer>();
        
        garo.add(Integer.parseInt(st.nextToken()));
        sero.add(Integer.parseInt(st.nextToken()));

        int n =Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            int what = Integer.parseInt(st.nextToken());
            int where = Integer.parseInt(st.nextToken());

            if(what == 0){
                int idx;
                for(idx = 0; where - sero.get(idx)>0; idx ++){
                    where -= sero.get(idx);
                }
                int tmp = sero.remove(idx);
                sero.add(idx, tmp-where);
                sero.add(idx, where);
            }else{
                int idx;
                for(idx = 0; where - garo.get(idx)>0; idx ++){
                    where -= garo.get(idx);
                }
                int tmp = garo.remove(idx);
                garo.add(idx, tmp-where);
                garo.add(idx, where);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i : garo){
            for(int j : sero){
                max = Math.max(i*j,max);
            }
        }

        bw.write(String.valueOf(max));
        br.close();
        bw.flush();
        bw.close();
    }

    
}
