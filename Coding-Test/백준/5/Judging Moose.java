import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken()); 

        if(l == 0 && r==0){
            System.out.println("Not a moose");
        }else{
            String str = l==r?"Even":"Odd";
            System.out.println(str+" "+Math.max(l,r)*2);
        }
    }
}
