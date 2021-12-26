import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int f1 = 0;
		int f2 = 1;
		int sum = 1;
		for(int i=2; i<=n; i++){
			sum = f1+f2;
			f1 = f2;
			f2 = sum;
		}

		System.out.println(sum);
	}
}
