import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int LP = L*P;
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<5; i++){
			int tmp = Integer.parseInt(st.nextToken());
			sb.append(tmp-LP).append(" ");
		}

		System.out.println(sb);
	}
}
