import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        while(flag){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int l = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            if(l==0 && w==0 && h==0 &&v == 0){
                flag = false;
                break;
            }else{                
                if(l== 0) {
                    l= v/(w*h);
                }else if(w==0){
                    w= v/(l*h);
                }else if(h==0){
                    h= v/(l*w);
                }else if(v==0) {
                    v = l*h*w;
                }
            }
            sb.append(l).append(" ").append(w).append(" ").append(h).append(" ").append(v).append('\n');
        }

        System.out.println(sb);
    }
}
