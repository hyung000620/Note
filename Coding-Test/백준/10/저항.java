import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = {"black", "brown","red","orange", "yellow","green","blue","violet","grey","white"};
        
        StringBuilder sb = new StringBuilder();
        
        String one = br.readLine();
        String two = br.readLine();
        String three = br.readLine();

        sb.append(Arrays.asList(arr).indexOf(one))
        .append(Arrays.asList(arr).indexOf(two));

        long result = (long)Math.pow(10, Arrays.asList(arr).indexOf(three));

        result *= Integer.parseInt(sb.toString());

        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }

    
    
}
