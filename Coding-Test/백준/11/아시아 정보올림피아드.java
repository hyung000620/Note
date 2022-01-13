import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Person implements Comparable<Person>{
    int nation, num, score;
    Person(int nation, int num, int score){
        this.nation = nation;
        this.num = num;
        this.score = score;
    }
    @Override
    public int compareTo(Person o) {
        return o.score - this.score;
    }
    
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        ArrayList<Person> list = new ArrayList<Person>();
        int[] arr = new int[101];
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int nation = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            
            list.add(new Person(nation, num, score));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        int print = 0;
        while(print<3){
            int nation_num = list.get(cnt).nation;
            arr[nation_num]++;
            if(arr[nation_num]<3){
                sb.append(list.get(cnt).nation+" "+list.get(cnt).num).append('\n');
                print++;
            }
            cnt++;
        }
        

        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    
}
