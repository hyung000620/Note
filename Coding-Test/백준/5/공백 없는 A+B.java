import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int len = str.length();

        if(len == 2){
            int result = (str.charAt(0)-'0')+(str.charAt(1)-'0');
            System.out.println(result);
            System.exit(0);
        }else if(len == 4){
            System.out.println(20);
            System.exit(0);
        }else{
            if(str.charAt(1) == '0'){
                int result = Integer.parseInt(str.substring(0, 2))+(str.charAt(2)-'0');
                System.out.println(result);
            }else if(str.charAt(2) == '0'){
                int result = Integer.parseInt(str.substring(1, 3))+(str.charAt(0)-'0');
                System.out.println(result);
            }
        }

    }
}
