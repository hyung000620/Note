import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int n1 = Integer.parseInt(st.nextToken())+1;
		int n2 = Integer.parseInt(st.nextToken())+1;
		int n12 = Integer.parseInt(st.nextToken())+1;

		int sum = (n1*n2/n12)-1;
		System.out.println(sum);
    }
}
