import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = 0;
        for(int i=0; i<6; i++){
            String str = br.readLine();
            if(str.equals("W")){
                cnt++;
            }
        }
        switch(cnt){
            case 5: case 6:
            System.out.println(1);
            break;
            case 3: case 4:
            System.out.println(2);
            break;
            case 1 : case 2:
            System.out.println(3);
            break;
            default :
            System.out.println(-1);
            break;
        }
    }
}
