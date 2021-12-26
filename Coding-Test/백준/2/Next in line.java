import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int child3 = Integer.parseInt(br.readLine());
		int child2 = Integer.parseInt(br.readLine());
		int child1 = child2-child3+child2;

		System.out.println(child1);
	}
}
