import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        int c = Integer.parseInt(arr[4]);

        String s = arr[1];

        String str;
        if(s.equals("+")){
            str = (a+b)==c?"YES":"NO";
            System.out.println(str);
        }
        if(s.equals("-")){
            str = (a-b)==c?"YES":"NO";
            System.out.println(str);
        }
        if(s.equals("*")){
            str = (a*b)==c?"YES":"NO";
            System.out.println(str);
        }
        if(s.equals("/")){
            str = (a/b)==c?"YES":"NO";
            System.out.println(str);
        }
    }
}
