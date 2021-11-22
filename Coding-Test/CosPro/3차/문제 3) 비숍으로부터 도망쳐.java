// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(String[] bishops) {
        int answer = 0;
				int[][] board = new int[8][8];
				int len = board.length;
		    int i = 0;
				while(i < bishops.length){
					int x = bishops[i].charAt(0) - 65;
					int y = bishops[i].charAt(1) - '0'-1;
					board[y][x] = 1;
					int dir = 0;
					int initX = x;
					int initY = y;
					while(dir <4){
						x = initX;
						y= initY;
						while(dir == 0 && x > 0 && y > 0) board[--y][--x] = 1;
						while(dir == 1 && x > 0 && y < 7) board[++y][--x] = 1;
						while(dir == 2 && x < 7 && y > 0) board[--y][++x] = 1;
						while(dir == 3 && x < 7 && y < 7) board[++y][++x] = 1;
						dir++;
					}
					i++;
				}
				answer = board.length * board[0].length; 
				for(int k=0; k<len; k++){
					for(int j=0; j<len; j++){
						if(board[k][j]==1) answer --;
					}
				}
				
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
