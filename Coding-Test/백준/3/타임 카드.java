import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       StringBuilder sb = new StringBuilder();
       for(int i=0; i<3; i++){
           StringTokenizer st = new StringTokenizer(br.readLine()," ");
           int h_In = Integer.parseInt(st.nextToken());
           int m_In = Integer.parseInt(st.nextToken());
           int s_In = Integer.parseInt(st.nextToken());
           int h_Out = Integer.parseInt(st.nextToken())-h_In;
           int m_Out = Integer.parseInt(st.nextToken())-m_In;
           int s_Out = Integer.parseInt(st.nextToken())-s_In;
           
           if(s_Out<0){
               s_Out +=60;
               m_Out--;
           }
           if(m_Out<0){
                m_Out +=60;
                h_Out--;
            }
            if(h_Out<0){
                s_Out +=24;
                
            }
           sb.append(h_Out).append(" ").append(m_Out).append(" ").append(s_Out).append('\n');
       }

       System.out.println(sb);
    }
}
