import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int answer = 0;
        int N = in.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<N; i++){
            int k = in.nextInt();
            if(k == 0 && !st.empty()) st.pop();
            else{
                st.push(k);
            }
        }
        while(!st.empty()){
            answer +=st.pop();
        }
        System.out.println(answer);
    }
}
