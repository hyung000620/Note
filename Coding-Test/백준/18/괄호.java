import java.util.*;
public class Main{
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=0; i<N; i++){
            System.out.println(T.solution(in.next()));
        }
    }
    public String solution(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(') st.push('(');
            else{
                if(st.empty()) return "NO";
                else st.pop();
            }
        }
        if(st.empty()) return "YES";
        else return "NO";
    }
}
