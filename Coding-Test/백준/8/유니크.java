import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");    
            for(int j=0; j<3; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] sumArr = new int[N];
        int sum = 0;
        for(int i=0; i<3; i++){   
            for(int j=0; j<N; j++){
                for(int k=0; k<N; k++){
                    if(j==k) continue;
                    if(arr[j][i]!= arr[k][i]){
                        sum = arr[j][i];
                    }else{
                        sum = 0;
                        break;
                    }
                }
                sumArr[j] += sum;
                sum = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i : sumArr){
            sb.append(i).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
}
