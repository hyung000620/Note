import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int[] arr = new int[3];
       StringTokenizer st = new StringTokenizer(br.readLine()," ");
       StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
       int sum = 0;

       for(int i=0; i<3; i++){
            arr[i] = Integer.parseInt(st2.nextToken())-Integer.parseInt(st.nextToken());
            if(arr[i]>0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
