import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len1 = br.readLine().length();
        int len2 = br.readLine().length();

        String result = len1<len2?"no":"go";

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
