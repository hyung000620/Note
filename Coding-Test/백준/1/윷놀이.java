import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main{

    public static void main(String[] args ) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<3; i++){
			int cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<4; j++){
				int num = Integer.parseInt(st.nextToken());
				cnt += num;
			}
			if(cnt == 4) sb.append("E").append('\n');
			if(cnt == 3) sb.append("A").append('\n');
			if(cnt == 2) sb.append("B").append('\n');
			if(cnt == 1) sb.append("C").append('\n');	
			if(cnt == 0) sb.append("D").append('\n');	
		}

		System.out.println(sb);
	}
}
