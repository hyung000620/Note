import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		if((factorial(k)*factorial(n-k))==0){
			System.out.println(1);
			System.exit(0);
		}
		int ans = factorial(n)/ (factorial(k)*factorial(n-k));

		System.out.println(ans);
    }
	public static int factorial(int num){
		if(num<=1) return num;
		else{
			return num* factorial(num-1);
		}
	}
}
