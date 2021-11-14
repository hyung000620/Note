import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next().toUpperCase();
        int max = 0;
        int[] arr = new int[26];
        char answer = '?';
        for(int i=0; i< str.length(); i++){
            arr[str.charAt(i)-65]++;
            if(arr[str.charAt(i)-65] > max){
                max = arr[str.charAt(i)-65];
                answer = str.charAt(i);
            }else if(max == arr[str.charAt(i)-65]){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
