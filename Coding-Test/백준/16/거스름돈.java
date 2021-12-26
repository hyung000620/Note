import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 1000-Integer.parseInt(br.readLine());
		int[] arr ={500,100,50,10,5,1};
		
		int cnt = 0;
		for(int i=0; i<6; i++){
			if(n>=arr[i]){
				cnt += n/arr[i];
				n -= (n/arr[i])*arr[i];
			}
		}
		

		System.out.println(cnt);
	}
}
