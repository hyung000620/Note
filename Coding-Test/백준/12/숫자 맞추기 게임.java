import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int cnt =1;
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            String type = "";
            int n1 = 3*n;
            int n2 = 0;
            if(n1%2==0){
                type = "even ";
                n2 = n1/2;
            }else if(n1%2==1){
                type = "odd ";
                n2 = (n1+1)/2;
            }
            int n3 = 3*n2;
            int n4 = n3/9;
            sb.append(cnt+". ").append(type).append(n4).append('\n');
            cnt++;
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
