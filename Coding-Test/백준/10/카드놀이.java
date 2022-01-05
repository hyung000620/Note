import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arrA = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        int[] arrB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        String[] arrS = new String[10];
        int sA = 0 , sB = 0;
        
        for(int i=0; i<10; i++){
            if(arrA[i] == arrB[i]){
                sA ++;
                sB ++;
                arrS[i] = "D";
            }else if(arrA[i]>arrB[i]){
                sA +=3;
                arrS[i] ="A";
            }else{
                sB +=3;
                arrS[i] = "B";
            }
        }
        String str ="";
        
        if(sA==10 && sB==10){
            str = "D";
        }else if(sA == sB){
            for(int i=9; i>=0; i--){
                if(!arrS[i].equals("D")){
                    str = arrS[i];
                    break;
                }
            }
        }else{
            str = sA>sB?"A":"B";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sA).append(" ")
        .append(sB).append('\n')
        .append(str);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
