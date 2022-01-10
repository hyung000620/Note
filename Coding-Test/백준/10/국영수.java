import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Subject implements Comparable<Subject>{
    String name;
    int korean;
    int english;
    int math;

    Subject(String name, int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Subject o) {
        if(this.korean<o.korean){
            return 1;
        }else if(this.korean == o.korean){
            if(this.english > o.english){
                return 1;
            }else if(this.english == o.english){
                if(this.math<o.math){
                    return 1;
                }else if(this.math == o.math){
                    if(this.name.compareTo(o.name)>0){
                        return 1;
                    }
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
        ArrayList<Subject> list = new ArrayList<>();

        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            list.add(new Subject(name, korean, english, math));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for(Subject s : list){
            sb.append(s.name).append('\n');
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    
}
