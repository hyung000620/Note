import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int p1 = Integer.parseInt(st.nextToken());
        int s1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int s2 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        int Persepolis = p1+p2;
        int Esteghlal = s1+s2;

        if(Persepolis == Esteghlal){
            if(p1!=s2){
                String str = p1<s2?"Persepolis":"Esteghlal";
                System.out.println(str);
                System.exit(0);
            }
            System.out.println("Penalty");
        }else{
            String str = Persepolis>Esteghlal?"Persepolis":"Esteghlal";
            System.out.println(str);
        }
    }
}
