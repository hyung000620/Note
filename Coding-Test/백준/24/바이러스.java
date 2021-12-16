import java.util.*;
import java.io.*;
public class Main{
    static int node, line;
    static int cnt = 0;
    static int[][] check;
    static boolean[] checked;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        check = new int[node+1][node+1];
        checked = new boolean[node+1];
        
        for(int i=0; i<line; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            check[x][y] = check[y][x] = 1;
        }
        dfs(1);
        
        System.out.println(cnt-1);
    }
    public static void dfs(int start){
        checked[start] = true;
        cnt ++;
        for(int i=0; i<=node; i++){
            if(check[start][i]==1 && !checked[i]) dfs(i);
        }
    }
}
