import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.parallelSort(arr);
        int x = Integer.parseInt(br.readLine());
        int count = 0;
		int start = 0;
		int end = n - 1;
		int sum = 0;
		
		while(start < end) {
			sum = arr[start] + arr[end];
			if(sum == x) {
				count++;
			}
			
			if(sum <= x) {
				start++;
			}
			else {
				end--;
			}
		}
        System.out.println(count);
    }
}
