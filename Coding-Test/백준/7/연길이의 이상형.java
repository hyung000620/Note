import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        char[] arr1 = {'E','S','T','J'};
        char[] arr2 = {'I','N','F','P'};

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<4; i++){
            if(str.charAt(i) == arr1[i]){
                sb.append(arr2[i]);
            }else{
                sb.append(arr1[i]);
            }
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
