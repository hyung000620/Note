import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<7; i++){
			int tmp = Integer.parseInt(br.readLine());
			if(tmp%2==1){
				list.add(tmp);
			}
		}
		if(list.size() == 0){
			System.out.println("-1");
			System.exit(0);
		}else{
			Collections.sort(list);
			int sum = 0;

			for(int i: list){
				sum += i;
			}

			System.out.println(sum);
			System.out.println(list.get(0));
		}

	}
}
