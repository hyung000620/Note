import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Person implements Comparable<Person>{
    String name;
    int year, mon, day;
    Person(String name, int year, int mon, int day){
        this.name = name;
        this.year = year;
        this.mon = mon;
        this.day = day;
    }
    @Override
    public int compareTo(Person o) {
        if(this.year < o.year){
            return 1;
        }else if(this.year == o.year){
            if(this.mon < o.mon){
                return 1;
            }else if(this.mon == o.mon){
                if(this.day < o.day){
                    return 1;
                }
            }
        }
        return -1;
    }

    
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Person> list = new ArrayList<>();
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            list.add(new Person(name, year, month, day));
        }

        Collections.sort(list);

        bw.write(list.get(0).name);
        bw.newLine();
        bw.write(list.get(list.size()-1).name);
        br.close();
        bw.flush();
        bw.close();
    }

    
}
