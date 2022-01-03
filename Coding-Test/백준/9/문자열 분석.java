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
        String input= "";

        while((input = br.readLine())!=null){
            int[] arr = new int[4];

            for(int i=0; i<input.length(); i++){
                char c = input.charAt(i);
                if(Character.isLowerCase(c)){
                    arr[0]++;
                }else if(Character.isUpperCase(c)){
                    arr[1]++;
                }else if(Character.isDigit(c)){
                    arr[2]++;
                }else{
                    arr[3]++;
                }
            }
            sb.append(arr[0]+" ").append(arr[1]+" ")
            .append(arr[2]+" ").append(arr[3]).append('\n');
        }
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
    
}
