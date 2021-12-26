import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine()," ");
       int[] arr = {1,1,2,2,2,8};
       
       for(int i=0; i<6; i++){
           arr[i] -= Integer.parseInt(st.nextToken());
       }

       StringBuilder sb = new StringBuilder();
       for(int i : arr){
            sb.append(i).append(" ");
       }
       
       System.out.println(sb);
    }
}
