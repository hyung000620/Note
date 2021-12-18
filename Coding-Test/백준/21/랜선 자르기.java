import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[k];
        
        long max = 0;
        
        for(int i=0; i<k; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(arr[i],max);
        }
               
        long lt = 1;
        long rt = max;
        
        while(lt<=rt){
            long mid = (lt+rt)/2;
            long sum = 0;
            
            for(int i=0; i<arr.length; i++){
                sum += (arr[i]/mid);
            }
            if(sum < n){
                rt = mid-1;
            }else{
                lt = mid+1;
            }
        }
        System.out.println(rt);
    }
}
