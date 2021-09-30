import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String result = "A";
        
        if(score < 90 && score >=80){
            result = "B";
        }else if(score >= 70 && score <= 79){
            result = "C";
        }else if(score >= 60 && score <= 69){
            result = "D";
        }else if(score < 60 ){
            result = "F";
        }    
        
        System.out.println(result);
        sc.close();
    }
}
