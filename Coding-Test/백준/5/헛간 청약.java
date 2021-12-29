import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken()); // 소들의 수
        int W = Integer.parseInt(st.nextToken()); // 헛간 크기 W
        int H = Integer.parseInt(st.nextToken()); // 헛간 크기 H
        int L = Integer.parseInt(st.nextToken()); // 소들에게 배정되는 크기

        int answer = Math.min((W/L)*(H/L),N);
        System.out.println(answer);
    }
}
