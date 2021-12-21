import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    static int n,k;
    static int[] visited = new int[100001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int result = bfs(n);
        System.out.println(result);
    }
    public static int bfs(int node){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        int idx = node;
        int a = 0;
        visited[idx] = 1;
        while(!q.isEmpty()){
            a= q.remove();
            if(a == k){
                return visited[a]-1;
            }
            if(a-1>=0 && visited[a-1]==0){
                visited[a-1] = visited[a]+1;
                q.add(a-1);
            }
            if(a+1<=100000 && visited[a+1]==0){
                visited[a+1] = visited[a]+1;
                q.add(a+1);
            }
            if(2*a<=100000 && visited[2*a] == 0){
                visited[2*a] = visited[a] +1;
                q.add(2*a);
            }
        }
        return -1;
    }
}
