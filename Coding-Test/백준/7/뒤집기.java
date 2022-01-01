import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = br.readLine().toCharArray();
        int zeroCnt = 0;
        int oneCnt = 0;

        if(arr[0] == '1'){
            oneCnt++;
        }else{
            zeroCnt++;
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]=='1') oneCnt++;
                else zeroCnt++;
            }
        }
        int cnt = Math.min(oneCnt, zeroCnt);
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
    
}
