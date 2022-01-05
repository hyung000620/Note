import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        for(int i=1; i<=N; i++){
            String s = String.valueOf(i);
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                if(c == '3' || c == '6' || c=='9'){
                    cnt++;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
    
}
