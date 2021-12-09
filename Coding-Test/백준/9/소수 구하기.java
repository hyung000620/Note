import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        boolean[] prime = new boolean[N+1];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 2; i <= N; i++) {
        	if(prime[i]) continue;  	
        	if(i >= M) sb.append(i).append('\n');
        	for(int j = i + i; j <= N; j += i) {
        		prime[j] = true;
        	}
        }
        System.out.println(sb);
    }
}
/**
언뜻 보기에는 이중for문이라 시간복잡도가 O(N²) 일 것 같지만 그렇지 않다.
즉, N 이하의 소수에 대하여 체에 거르는 시간이 logN 이므로 단순하게 체에 거르는 것만 해도 시간 복잡도는 O(N㏒N) 이다.
( ㏒ 는 자연로그 𝑙𝑛 으로 본다 )
그런데 우리는 여기서 더 나아가 이미 체크된 배열은 검사하지 않고 다음 반복문으로 넘어간다.
**/
