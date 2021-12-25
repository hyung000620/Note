import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int cnt = 0;
		for(int i=1; i<=8; i++){
			int music = Integer.parseInt(st.nextToken());
			if(music == i){
				cnt++;
				if(cnt == 8){
					System.out.println("ascending");
					break;
				}
			}else if(music == (9-i)){
				cnt--;
				if(cnt == -8){
					System.out.println("descending");
					break;
				}
			}
		}

		if(cnt != 8 && cnt != -8){
			System.out.println("mixed");
		}
	}
}
