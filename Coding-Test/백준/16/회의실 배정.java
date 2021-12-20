import java.util.*;
import java.io.*;
class Meeting implements Comparable<Meeting>{
    int start,end;
    Meeting(int start, int end){
        this.start = start;
        this.end = end;
    }
    @Override
    public int compareTo(Meeting m){
        if(this.end == m.end) return this.start - m.start;
        return this.end - m.end;
    }
}
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        ArrayList<Meeting> list = new ArrayList<>();
        
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new Meeting(start, end));
        }
        
        Collections.sort(list);
        int cnt = 0;
        int preTime = 0;
        for(int i=0; i<T; i++){
            if(preTime <= list.get(i).start ){
                preTime = list.get(i).end;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
