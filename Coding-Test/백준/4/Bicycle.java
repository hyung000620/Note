import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        int first = ((T-30)*x)*21>0?((T-30)*x)*21+a:a;
        int second = ((T-45)*y)*21>0?(((T-45)*y)*21)+b:b;
    
        System.out.println(first+" "+second);
    }    
}
