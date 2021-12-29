import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] bir = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray(); // 태어난 날짜
        int[] sta = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray(); // 기준이 되는 날짜

        int man_old = 0;
        int se_old = 0;
        int year_old = 0;

        if(bir[1]<sta[1]){
            man_old = sta[0] - bir[0];
        }else if(bir[1] == sta[1]){
            if(bir[2]<=sta[2]){
                man_old = sta[0] - bir[0];
            }else{
                man_old = sta[0] - bir[0] -1;
            }
        }else{
            man_old = sta[0] - bir[0] -1;
        }
        se_old = sta[0] - bir[0] +1;
        year_old = sta[0] - bir[0] ;

        
        StringBuilder sb = new StringBuilder();
        sb.append(man_old).append('\n')
        .append(se_old).append('\n')
        .append(year_old);

        System.out.println(sb);
    }
}
