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
        if(arr[0] == 'F'){
            bw.write(String.valueOf(0.0));
            bw.close();
            br.close();
        }
        double result = 0.0;
        if(arr.length == 2){
        switch(arr[0]){
            case 'A':
            result += 4;
            break;
            case 'B':
            result += 3;
            break;
            case 'C':
            result += 2;
            break;
            case 'D':
            result += 1;
            break;
        }
        
        if(arr[1]=='+'){
            result += 0.3;
        }else if(arr[1] == '-'){
            result -= 0.3;
        }
        
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
    }
}
