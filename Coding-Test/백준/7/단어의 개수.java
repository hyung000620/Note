import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringTokenizer st = new StringTokenizer(str," ");
        System.out.println(st.countTokens());
    }
}
