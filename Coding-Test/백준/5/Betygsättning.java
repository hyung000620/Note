import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double a = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());
        double e = Double.parseDouble(st.nextToken());

        double[] arr = new double[3];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<3; i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }

        char ch = solution(a,c,e,arr);
        System.out.println(ch);
    }

    public static char solution(double a, double c, double e, double[] arr){
        if(arr[0]>=a && arr[1]>=c && arr[2]>=e) return 'A';
        if(arr[0]>=a/2 && arr[1]>=c && arr[2]>=e) return 'B';
        if(arr[1]>=c && arr[2]>=e) return 'C';
        if(arr[1]>=c/2 && arr[2]>=e) return 'D';
        
        return 'E';
    }
}
