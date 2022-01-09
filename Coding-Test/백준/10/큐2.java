import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> Q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int B = 0;
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String str = st.nextToken();
            switch(str){
                case "push":
                int n = Integer.parseInt(st.nextToken());
                B = n;
                Q.add(n);
                break;
                
                case "pop":
                if(Q.isEmpty())sb.append(-1).append('\n');
                else sb.append(Q.poll()).append('\n');
                break;
                
                case "size":
                sb.append(Q.size()).append('\n');
                break;
                
                case "empty":
                if(Q.isEmpty())sb.append(1).append('\n');
                else sb.append(0).append('\n');
                break;

                case "front":
                if(Q.isEmpty()) sb.append(-1).append('\n');
                else sb.append(Q.peek()).append('\n');
                break;

                case "back":
                if(Q.isEmpty()) sb.append(-1).append('\n');
                else sb.append(B).append('\n');
                break;
            }
            
        }

        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    
}
