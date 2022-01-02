import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<N; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for(int i : list){
            sb.append(i+" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
