import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String input = br.readLine();
            if(input.equals("=")) break;
            
            list.add(input);
        }
        int answer = Integer.parseInt(list.get(0));

        for(int i=1; i<list.size()-1; i++){
            String s = list.get(i);
            if(s.equals("+") || s.equals("-") || s.equals("*")|| s.equals("/")){
                char ch = s.charAt(0);
                int tmp = Integer.parseInt(list.get(i+1));
                if(ch == '+')answer += tmp;
                if(ch == '-')answer -= tmp;
                if(ch == '*')answer *= tmp;
                if(ch == '/')answer /= tmp;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
    
}
