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
        ArrayList<Integer> list = new ArrayList<>();
        int num = 1;
        int cnt = 0;
        for(int i=0; i<1000; i++){
            list.add(num);
            cnt ++;
            if(num == cnt){
                num++;
                cnt = 0;
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int sum = 0;
        for(int i=A-1; i<=B-1; i++){
            sum += list.get(i);
        }


        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
    
}
