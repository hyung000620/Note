import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] solved = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<M; i++) solved[i] = Integer.parseInt(st.nextToken());

        int[] score = new int[N];
        for(int i=0; i<M; i++){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            for(int j=0; j<N; j++){
                if(arr[j] == solved[i]){
                    score[j]++;
                }else{
                    score[solved[i]-1] ++;
                }
            }
        }

        for(int i : score){
            bw.write(String.valueOf(i));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    
}
