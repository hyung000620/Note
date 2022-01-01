import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] arr = new char[8][8];
        int cnt = 0;
        
        for(int i=0; i<8; i++){
            
            char[] ch = br.readLine().toCharArray();
            
            for(int j=0; j<8; j++){
                
                char c = ch[j];
                arr[i][j] = c;
                
                if((i+j)%2==0 && c=='F'){
                    cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
    }
    
}
