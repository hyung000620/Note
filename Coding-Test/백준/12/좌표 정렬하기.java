import java.io.*;
import java.util.*;
class Point implements Comparable<Point>{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o){
        if(this.x == o.x) return this.y - o.y;
        return this.x - o.x;
    }
}
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Point> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Point(x,y));
        }
        
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(list.get(i).x).append(" ").append(list.get(i).y).append('\n');
        }
        
        System.out.println(sb);
    }
}
