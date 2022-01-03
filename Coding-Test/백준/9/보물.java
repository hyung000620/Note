import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] arr1 = new int[N];
        Integer[] arr2 = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()," ");
        int sum = 0;
        for(int i=0; i<N; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2){
                return i2 - i1;
            }
        });
        for(int i=0; i<N; i++){
            sum += arr1[i] *arr2[i];
        }


        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
    }
    
}
