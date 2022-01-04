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
        StringBuilder sb = new StringBuilder();
        Main M = new Main();

        while(true){
            String str = br.readLine();
            
            if(str.equals(".")) break;

            sb.append(M.solution(str)).append('\n');
        }

        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
    public String solution(String s){
        Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);	// i 번째 문자 
		
			if(c == '(' || c == '[') {
				stack.push(c);
			}

			else if(c == ')') {

				if(stack.empty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
			else if(c == ']') {

				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
		}
		
		if(stack.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
    }
}
