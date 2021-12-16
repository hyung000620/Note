/**
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000),
탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
**/
import java.util.*;
import java.io.*;
public class Main{
    static int[][] check;
    static boolean[] checked;
    static int N,M,V;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        
        check = new int[1001][1001];
        checked = new boolean[1001];
        
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            check[x][y] = check[y][x] = 1;
        }
        sb = new StringBuilder();
        dfs(V);
        sb.append('\n');
        checked = new boolean[1001]; // 초기화
        bfs();
        System.out.println(sb);
    }
    public static void dfs(int v){
        checked[v] = true;
        sb.append(v+" ");
        for(int i=1; i<=N; i++){
            if(check[v][i] == 1 && checked[i] == false) dfs(i);
        }
    }
    public static void bfs(){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(V);
        checked[V] = true;
        sb.append(V+" ");
        while(!Q.isEmpty()){
            int tmp = Q.poll();
            for(int i=1; i<=N; i++){
                if(check[tmp][i] == 1 && checked[i] == false){
                    Q.offer(i);
                    checked[i] = true;
                    sb.append(i+" ");
                }
            }
        }
    
    }
}
