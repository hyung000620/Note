import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

class School implements Comparable<School>{
    String name;
    int i;
    
    School(String name, int i){
        this.name = name;
        this.i = i;
    }

    @Override
    public int compareTo(School o) {  
        return o.i - this.i;
    }

    
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            ArrayList<School> list = new ArrayList<>();
            
            for(int i=0; i<N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                String name = st.nextToken();
                int L = Integer.parseInt(st.nextToken());
                list.add(new School(name, L));
            }

            Collections.sort(list);

            sb.append(list.get(0).name).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
