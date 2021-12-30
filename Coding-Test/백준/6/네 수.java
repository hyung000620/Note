import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(" ");
        long AB = Long.parseLong(arr[0]+arr[1]);
        long CD = Long.parseLong(arr[2]+arr[3]);

        AB += CD;

        bw.write(String.valueOf(AB));

        br.close();
        bw.flush();
        bw.close();

    }
}
