import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][M+1];

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=1; j<=M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine()," ");
            int idx = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            sb.append(T.solution(arr, idx, j, x, y)).append('\n');
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
    public int solution(int[][] arr , int i , int j, int x, int y){
        int sum = 0;
        for(int h=i; h<=x; h++){
            for(int k=j; k<=y; k++){
                sum += arr[h][k];
            }
        }
        return sum;
    }
}
