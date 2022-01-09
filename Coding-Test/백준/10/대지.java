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
        if(this.x == o.x) return this.y - o.y;
        return this.x - o.x;
    }
    
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        ArrayList<Point> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            min = Math.min(min, y);
            max = Math.max(max, y);
            list.add(new Point(x, y));
        }

        if(list.size()==1){
            bw.write(String.valueOf(0));
        }else{
            Collections.sort(list);
            int result = (list.get(list.size()-1).x - list.get(0).x) * (max -min);
            bw.write(String.valueOf(result));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    
}
