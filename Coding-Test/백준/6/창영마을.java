import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        char[] arr = br.readLine().toCharArray();
        int[] tmp = {1,0,0};
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            char ch = arr[i];
            if(ch == 'A'){
                swap(tmp ,0, 1);
            }else if(ch == 'B'){
                swap(tmp, 1, 2);
            }else{
                swap(tmp, 0, 2);
            }
        }

        for(int i=0; i<3; i++){
            if(tmp[i] == 1){
                cnt = i+1;
            }
        }

        System.out.println(cnt);
    }
    public static void swap(int[] arr ,int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
