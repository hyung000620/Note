import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int mok = 0, ext;
        int sum = 0;
        int cnt = 0;

        for(int i = 1; i<=n; i++){
            mok = i;
            sum = 0;
            while(true) {
    			
    			if(mok == 0)
    				break;
    			ext = mok % 10;
    			mok = mok / 10;
    			
    			sum = sum + ext;
    		}
    		
    		if(i % sum == 0)
    			cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        
    }
    
}
