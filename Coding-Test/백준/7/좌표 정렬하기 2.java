import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

class Point implements Comparable<Point>{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        if(this.y == o.y) return this.x - o.x;
        return this.y - o.y;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        ArrayList<Point> list = new ArrayList<Point>();
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
        
            list.add(new Point(x,y));
        }

        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();

        for(Point o : list){
            sb.append(o.x).append(" ").append(o.y).append('\n');
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
    
}
