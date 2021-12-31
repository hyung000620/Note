import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(N-->0){
            int tmp = Integer.parseInt(br.readLine());
            String str = Integer.toBinaryString(tmp);
            str = new StringBuilder(str).reverse().toString();

            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='1'){
                    sb.append(i).append(" ");
                }
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
