import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        double[] prices = { 350.34, 230.90, 190.55, 125.30, 180.90};
        
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            double sum = 0;
            
            for(int j=0; j<5; j++){
                double tmp = Double.parseDouble(st.nextToken());
                sum += tmp*prices[j];
            }

            sb.append(String.format("$%.2f", sum)).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
