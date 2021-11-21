import java.io.*;
public class Main{
    public int factorial(int num){
        if(num == 0) return 1;
        if(num == 1) return 1;
        else{
            return factorial(num-1)*num;
        }
    }
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(T.factorial(N));
    }
}
