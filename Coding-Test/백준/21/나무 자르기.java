import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] tree = new int[N];
        
        int max = 0;
        int min = 0;
        
        st = new StringTokenizer(br.readLine()," ");
        
        for(int i=0; i<N; i++){
            tree[i] = Integer.parseInt(st.nextToken());
            if(max<tree[i]){
                max = tree[i];
            }
        }
        while(min<max){
            int mid = (min+max)/2;
            long sum = 0;
            for(int h : tree){
                if(h-mid>0){
                    sum += (h-mid);
                }
            }
            if(sum<M){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        System.out.println(min-1);
    }
}
