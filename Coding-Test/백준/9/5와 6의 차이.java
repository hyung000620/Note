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

        arr[0] = arr[0].replace('5', '6');
        arr[1] = arr[1].replace('5', '6');

        int max = Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);

        arr[0] = arr[0].replace('6', '5');
        arr[1] = arr[1].replace('6', '5');

        int min = Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
        
        bw.write(min +" "+max);
        bw.flush();
        bw.close();
    }
    
}
