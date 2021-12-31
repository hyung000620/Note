import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Player{
    int win;
    Player(int win){
        this.win = win;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            int n = Integer.parseInt(br.readLine());
            Player player1 = new Player(0);
            Player player2 = new Player(0);

            for(int i=0; i<n; i++){
                String[] sp = br.readLine().split(" ");
                game(player1, player2, sp[0], sp[1]);
            }

            if(player1.win == player2.win){
                sb.append("TIE").append('\n');
            }else if(player1.win > player2.win){
                sb.append("Player 1").append('\n');
            }else{
                sb.append("Player 2").append('\n');
            }
        }

        System.out.print(sb);
    }

    public static void game(Player p1, Player p2, String s1, String s2){
        if(s1.equals("R") && s2.equals("P")){
            p2.win ++;
        }else if(s1.equals("P") && s2.equals("S")){
            p2.win ++;
        }else if(s1.equals("S") && s2.equals("R")){
            p2.win ++;
        }else if(s1.equals(s2)){
            p1.win ++;
            p2.win ++;
        }else{
            p1.win ++;
        }
    }
}
