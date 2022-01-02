import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        String[] arr = new String[N];
        
        StringBuilder sb = new StringBuilder();
        
        boolean flag = true;
        for(int i=0; i<N; i++) arr[i] = br.readLine();
        
        for(int i=0; i<arr[0].length(); i++){
            char ch = arr[0].charAt(i);
            
            flag =true;

            for(int j=1; j<N; j++){
                if(ch != arr[j].charAt(i)){
                    flag = false;
                }
            }
            if(flag){
                sb.append(ch);
            }
            else{
                sb.append('?');
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
