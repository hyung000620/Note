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
    int price;

    Person(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Person o) {
        return o.price - this.price;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while(N-->0){
            int T = Integer.parseInt(br.readLine());
            ArrayList<Person> list = new ArrayList<>();
            for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
            int p = Integer.parseInt(st.nextToken());
            String n = st.nextToken();

            list.add(new Person(n, p));
            }

            Collections.sort(list);
            sb.append(list.get(0).name).append('\n');    
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
