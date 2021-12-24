import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        int time = Integer.parseInt(br.readLine());

        min += time;

        if(min>=60){
            hour += min/60;
            min = min%60;
        }
        if(hour >=24){
            hour -= 24;
        }
        sb.append(hour).append(" ").append(min);

        System.out.println(sb);
    }
}
