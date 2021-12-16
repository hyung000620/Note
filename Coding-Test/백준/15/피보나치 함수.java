/**
입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.

출력
각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다
**/
import java.util.*;
import java.io.*;
public class Main{
    static int zero, one, zeroPlusOne;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            fibonachi(n);
            sb.append(zero).append(' ').append(one).append('\n');    
        }
        System.out.println(sb);
    }
    public static void fibonachi(int n){
        zero = 1;
        one = 0;
        zeroPlusOne = 1;
        for(int i=0; i<n; i++){
            zero = one;
            one = zeroPlusOne;
            zeroPlusOne = zero + one;
        }
    }
}
