import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    public static int[] festival_2017 = {500,300,200,50,30,10};
    public static int[] festival_2017_su = {1,2,3,4,5,6};
    public static int[] festival_2018 = {512,256,128,64,32};
    public static int[] festival_2018_su = {1,2,4,8,16};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            CodeFestival(arr, i, a, b);
        
            bw.write(String.valueOf(arr[i])+'\n');
        }

        bw.flush();
        bw.close();
    }

    public static void CodeFestival(int[] arr, int idx, int a, int b){
        int temp = 0;
        int money = 0;

        if(a!=0){
            for(int i=0; i<6; i++){
                if(temp+ festival_2017_su[i]>=a){
                    money += festival_2017[i];
                    break;
                }
                temp += festival_2017_su[i];
            }
        }
        temp = 0;

        if(b!=0){
            for(int i=0; i<5; i++){
                if(temp+ festival_2018_su[i]>=b){
                    money += festival_2018[i];
                    break;
                }
                temp += festival_2018_su[i];
            }
        }

        arr[idx] = money*10000;
    }
}
