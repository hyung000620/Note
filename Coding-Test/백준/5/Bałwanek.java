import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken())*1000;
        int k = Integer.parseInt(st.nextToken());

        int A = 0;
        int B = 0;
        int C = 0;
        if(7000*k<=x) A =7000*k;
        if(3500*k<=x) B =3500*k;
        if(1750*k<=x) C =1750*k;
        int result = Math.max(A, Math.max(B, C));
        System.out.println(result);
    }
}
