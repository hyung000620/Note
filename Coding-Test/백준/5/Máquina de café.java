import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A1 = Integer.parseInt(br.readLine());
        int A2 = Integer.parseInt(br.readLine());
        int A3 = Integer.parseInt(br.readLine());

        int floor1 = A2*2+A3*4;
        int floor2 = A1*2+A3*2;
        int floor3 = A1*4+A2*2;

        int answer = Math.min(floor1, Math.min(floor2, floor3));

        System.out.println(answer);
    }
}
