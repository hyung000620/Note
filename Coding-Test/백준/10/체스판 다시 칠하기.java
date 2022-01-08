import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static boolean[][] arr;
    public static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<M; j++){
                if(s.charAt(j) == 'W'){
                    arr[i][j] = true;
                }else {
                    arr[i][j] = false;
                }
            }
        }

        int N_row = N - 7;
        int M_row = M - 7;

        for(int i=0; i<N_row; i++){
            for(int j=0; j<M_row; j++){
                find(i,j);
            }
        }

        bw.write(String.valueOf(min));
        br.close();
        bw.flush();
        bw.close();
    }

    public static void find(int x, int y){
        int x_end = x+8;
        int y_end = y+8;
        int cnt = 0;

        boolean tf = arr[x][y];

        for(int i=x; i< x_end; i++){
            for(int j=y; j<y_end; j++){

                if(arr[i][j] != tf){
                    cnt++;
                }

                tf = (!tf);
            }
            tf = (!tf);
        }

        cnt = Math.min(cnt, 64-cnt);
        min = Math.min(min, cnt);
    }
    
}
