import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String input = st.nextToken();

            switch(input){
                case "push_front":{
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "push_back":{
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "pop_front":{
                    if(dq.isEmpty())sb.append(-1).append('\n');
                    else sb.append(dq.pollFirst()).append('\n');
                    break;
                }
                case "pop_back":{
                    if(dq.isEmpty())sb.append(-1).append('\n');
                    else sb.append(dq.pollLast()).append('\n');
                    break;
                }
                case "size":{
                    sb.append(dq.size()).append('\n');
                    break;
                }
                case "empty":{
                    if(dq.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;
                }
                
                case "front":{
                    if(dq.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(dq.peekFirst()).append('\n');
                    break;
                }
                case "back":{
                    if(dq.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(dq.peekLast()).append('\n');
                    break;
                }
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    
}
