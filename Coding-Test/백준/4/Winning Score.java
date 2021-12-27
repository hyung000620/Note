import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int banana = 0;
        int apple = 0;

        for(int i=3; i>0; i--){
            banana += Integer.parseInt(br.readLine())*i;
        }

        for(int i=3; i>0; i--){
            apple += Integer.parseInt(br.readLine())*i;
        }

        if(banana == apple){
            System.out.println("T");
            System.exit(0);
        }else{
            String str = banana>apple?"A":"B";
            System.out.println(str);
            System.exit(0);
        }
    }
}
