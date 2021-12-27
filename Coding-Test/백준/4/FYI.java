import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().substring(0,3);
        
        if(str.equals("555")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}
