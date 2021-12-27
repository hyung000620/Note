import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int axel = Integer.parseInt(st.nextToken())*7;
        int petra = Integer.parseInt(st.nextToken())*13;

        if(axel == petra){
            System.out.println("lika");
        }else{
            String str = axel>petra?"Axel":"Petra";
            System.out.println(str);
        }
    }
}
