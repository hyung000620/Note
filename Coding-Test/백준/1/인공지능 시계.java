import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int hour = Integer.parseInt(st.nextToken()); // 시간
		int min = Integer.parseInt(st.nextToken()); // 분
		int sec = Integer.parseInt(st.nextToken()); // 초

		int d = Integer.parseInt(br.readLine()); // 필요한 시간(초)

		sec += d;
		while(true){
			if(sec>= 60){
			min += sec/60;
			sec = sec%60;
			}
			if(min>= 60){
			hour += min/60;
			min = min%60;
			}
			if(hour>= 24){
			hour -= 24;
			}

			if(hour < 24 && min < 60 && sec <60) break;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(hour).append(" ").append(min).append(" ").append(sec);

		System.out.println(sb);
	}
}
