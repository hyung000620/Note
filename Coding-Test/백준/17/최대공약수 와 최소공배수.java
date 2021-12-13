import java.io.*;
import java.util.*;
public class Main{
    public static int gcd(int a, int b){
        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int G = gcd(A,B);
        
        System.out.println(G); // 최대 공약수
        
        System.out.println(A*B/G); // 최소 공배수
    }
}
