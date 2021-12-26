import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{

    public static void main(String[] args ) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<n; i++){
			String str = br.readLine();
			sb = new StringBuilder(str);
			for(int j=0; j<m/2; j++){
				if(str.charAt(j)!= '.'){
					sb.setCharAt(m-j-1, str.charAt(j));
				} 
			}
			for(int j=m/2; j<m; j++){
				if(str.charAt(j)!= '.'){
					sb.setCharAt(m-j-1, str.charAt(j));
				} 
			}
			sb2.append(sb).append('\n');
		}
		System.out.println(sb2);

		
	}
}
