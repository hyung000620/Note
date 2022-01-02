import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();

        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='('){
                stack.push('(');
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    cnt++;
                }
            }
        }
        cnt += stack.size();
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
    
}
