import java.util.*;
import java.io.*;
public class Main{
    static int[][] apt = new int[15][15]; // 범위가 1 ≤ k, n ≤ 14 이므로 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        makeApt();
        
        for(int i=0; i<T; i++){
            int k = Integer.parseInt(br.readLine()); //k층
            int n = Integer.parseInt(br.readLine()); //n호
            sb.append(apt[k][n]).append('\n');
        }
        System.out.println(sb);
    }
    public static void makeApt(){
        for(int i=0; i<15; i++){
            apt[i][1] = 1; //i층 1호
            apt[0][i] = i; //0층 i호
        }
        for(int i=1; i< 15; i++){ //1층부터 14층까지
            for(int j =2; j<15; j++){ //2호부터 14호까지
                apt[i][j] = apt[i][j-1] + apt[i-1][j];
            }
        }
    }
}
