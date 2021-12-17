import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(recur(N,0));
    }
    static int recur(int n, int count){
        if(n<2) return count;
        return Math.min(recur(n/2,count+1+(n%2)),recur(n/3,count+1+(n%3)));
    }
}
