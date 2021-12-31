import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int q1 =0, q2 = 0, q3= 0, q4 = 0, ax =0;
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x == 0 || y == 0){
                ax ++;
            }else if(x>0 && y>0){
                q1 ++;
            }else if(x<0 && y>0){
                q2 ++;
            }else if(x<0 && y<0){
                q3++;
            }else{
                q4 ++;
            }
        }
        sb.append("Q1: ").append(q1).append('\n')
        .append("Q2: ").append(q2).append('\n')
        .append("Q3: ").append(q3).append('\n')
        .append("Q4: ").append(q4).append('\n')
        .append("AXIS: ").append(ax);

        System.out.print(sb);
    }
}
