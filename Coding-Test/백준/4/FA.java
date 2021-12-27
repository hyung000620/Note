import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String n = br.readLine();

       int fa = 0;
       int nfa = 0;
       int tmp = 0;
       while(true){
           int preNum = n.charAt(0)*n.length();
           
           if(preNum != tmp){
               tmp = preNum;
               nfa++;
           }else if(preNum == tmp){
               fa ++;
           }
           if(fa >=3){
            System.out.println("FA"); 
            break;
            }
           if(nfa >=10000){
              System.out.println("NFA"); 
              break;
           }
       } 
    }
}
