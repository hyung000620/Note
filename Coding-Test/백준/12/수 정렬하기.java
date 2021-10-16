import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        
        for(int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arr);
        
        for(int num : arr){
            System.out.println(num);
        }
    }
}
