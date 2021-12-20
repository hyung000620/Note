import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            int dis = y-x;
            
            int max = (int)Math.sqrt(dis);
            
            if(max == Math.sqrt(dis)){
                sb.append(max*2-1).append('\n');
            }else if(dis <= max* max+max){
                sb.append(max*2).append('\n');
            }else{
                sb.append(max*2+1).append('\n');
            }
        }
        System.out.println(sb);
    }
}
