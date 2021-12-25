import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while(true){
			String str = br.readLine();
			
			if(str.equals("0")) break;

			String str2 = new StringBuilder(str).reverse().toString();
			
			if(str.equals(str2)){
				sb.append("yes").append('\n');
			}else{
				sb.append("no").append('\n');
			}
		}

		System.out.println(sb);
    }
}
