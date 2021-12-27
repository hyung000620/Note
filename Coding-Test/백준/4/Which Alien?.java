import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int antenna = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());

        if(antenna>6 && eyes>4){
            System.exit(0);
        }

        StringBuilder sb = new StringBuilder();
        if(antenna>=3 && eyes<=4){
            sb.append("TroyMartian").append('\n');
        }
        if(antenna<=6 && eyes>=2){
            sb.append("VladSaturnian").append('\n');
        }
        if(antenna<=2 && eyes<=3){
            sb.append("GraemeMercurian").append('\n');
        }

        System.out.println(sb);
    }    
}
