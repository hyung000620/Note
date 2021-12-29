import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int plus = 0;
        int minus = 0;
        int same = 0;
        int preNum = Integer.parseInt(br.readLine());
        for(int i=0; i<3; i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp>preNum){
                plus ++;
                preNum = tmp;
            }else if(tmp <preNum){
                minus ++;
                preNum = tmp;
            }else if(tmp == preNum){
                same ++;
            }
        }
        if(plus == 3){
            System.out.println("Fish Rising");
        }else if(minus == 3){
            System.out.println("Fish Diving");
        }else if(same == 3){
            System.out.println("Fish At Constant Depth");
        }else if(plus != 3 && minus !=3 && same !=3){
            System.out.println("No Fish");
        }
    }
}
