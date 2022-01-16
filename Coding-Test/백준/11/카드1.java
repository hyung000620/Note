import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> Q = new LinkedList<>();

        for(int i=1; i<=N; i++){
            Q.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        while(Q.size()!=1){
            sb.append(Q.poll()).append(" ");
            Q.offer(Q.poll());
        }
        sb.append(Q.poll());
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
