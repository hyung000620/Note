import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        String str = solution(A, B, C);
        if(str.equals("not")){
            str = solution2(B, C, A);
        }
        bw.write(str);
        br.close();
        bw.flush();
        bw.close();
    }
    public static String solution(int a, int b, int c){
        if(a+b == c){
            return a+"+"+b+"="+c;
        }
        if(a-b == c){
            return a+"-"+b+"="+c;
        }
        if(a*b == c){
            return a+"*"+b+"="+c;
        }
        if(a/b == c){
            return a+"/"+b+"="+c;
        }
        return "not";
    }
    public static String solution2(int b, int c, int a){
        if(a== b+c){
            return a+"="+b+"+"+c;
        }
        if(a == b-c){
            return a+"="+b+"-"+c;
        }
        if(a== b*c){
            return a+"="+b+"*"+c;
        }
        if(a==b/ c){
            return a+"="+b+"/"+c;
        }
        return "not";
    }
}
