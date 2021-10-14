import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String strNum = in.next();
        in.close();
        int sum = 0;
        for(int i=0; i < n; i++){
            sum += strNum.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
