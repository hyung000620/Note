import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++) list.add(Integer.parseInt(br.readLine()));
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int x : list){
            sb.append(x).append('\n');
        }
        System.out.println(sb);
    }
}
