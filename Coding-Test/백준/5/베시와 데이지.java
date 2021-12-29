import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //bessie
        int bx = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        //daisy
        int dx = Integer.parseInt(st.nextToken());
        int dy = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int bessie = Math.max(Math.abs(x-bx),Math.abs(y-by));
        int daisy = Math.abs(x-dx)+Math.abs(y-dy);

        if(bessie == daisy){
            System.out.println("tie");
        }else{
            String str = bessie>daisy?"daisy":"bessie";
            System.out.println(str);
        }
    }
}
