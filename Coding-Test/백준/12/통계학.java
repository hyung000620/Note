import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    /** 산술평균 : N개의 수들의 합을 N으로 나눈 값
    중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
    최빈값 : N개의 수들 중 가장 많이 나타나는 값
    범위 : N개의 수들 중 최댓값과 최솟값의 차이 **/
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++){
            int val = Integer.parseInt(br.readLine());
            arr[i] = val;
            sum += val;
        }

        Arrays.sort(arr);

        boolean flag = false;
        int max = 0;
        int mode = 10000;

        for(int i=0; i<n; i++){
            int jump =0;
            int cnt =1;
            int val = arr[i];

            for(int j=i+1; j<n; j++){
                if(val != arr[j]){
                    break;
                }
                cnt ++;
                jump ++;
            }
            if(cnt>max){
                max = cnt;
                mode = val;
                flag = true;
            }
            else if(cnt == max && flag== true){
                mode = val;
                flag = false;
            }
            i += jump;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((int)Math.round((double)sum/n)).append('\n');
        sb.append(arr[n/2]).append('\n');
        sb.append(mode).append('\n');
        sb.append(arr[n-1]-arr[0]);
        System.out.println(sb);
    }
}
