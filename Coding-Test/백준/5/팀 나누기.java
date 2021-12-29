import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int[] arr = new int[4];

        for(int i=0; i<4; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int sum1 = (arr[0]+arr[3])-(arr[1]+arr[2]);
        int sum2 = (arr[1]+arr[2])- (arr[0]+arr[3]);
        int answer = Math.min(sum1,sum2);
        System.out.println(Math.abs(answer));
    }
}
