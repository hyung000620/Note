import java.io.*;
import java.util.*;
class Person{
    int weight, height; //몸무게, 키
    Person(int weight, int height){
        this.weight = weight;
        this.height = height;
    }
}
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Person> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            list.add(new Person(w,h));
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            int rank = 1;
            for(int j=0; j<N; j++){
                if(i==j) continue;
                else if(list.get(i).weight <list.get(j).weight && list.get(i).height <list.get(j).height){
                    rank++;
                }
            }
            sb.append(rank).append('\n');
        }
        System.out.println(sb);
    }
}
