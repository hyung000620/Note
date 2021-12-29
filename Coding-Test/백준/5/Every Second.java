import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] s = Arrays.stream(br.readLine().split(" : ")).mapToInt(Integer :: parseInt).toArray();
        int[] e = Arrays.stream(br.readLine().split(" : ")).mapToInt(Integer :: parseInt).toArray();

        int start = s[0]*3600+s[1]*60+s[2]; 
        int end = e[0]*3600+e[1]*60+e[2];

        int result = end-start>0?end-start:end-start+3600*24;

        System.out.println(result);
    }
}
