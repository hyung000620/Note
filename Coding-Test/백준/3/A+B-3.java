import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] result = new int[T];
        
        for(int i =0; i<result.length; i++){
            int A = in.nextInt();
            int B = in.nextInt();
            result[i] = A+B;
        }
        in.close();
        for(int k : result){
            System.out.println(k);
        }
    }
}
