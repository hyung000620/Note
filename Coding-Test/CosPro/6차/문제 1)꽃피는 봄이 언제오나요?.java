// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
class Flower{
	int x, y, day;
	Flower(int x, int y, int day){
		this.x = x;
		this.y =y;
		this.day = day;
	}
}
class Main {
    public int solution(int n, int[][] garden) {
        int answer = 0;
				int[] dx = {-1,1,0,0};
				int[] dy = {0,0,-1,1};
				Queue<Flower> Q = new LinkedList<Flower>();
				
				for(int i=0; i<n; i++){
					for(int j=0; j<n; j++){
						if(garden[i][j]==1) Q.offer(new Flower(i,j,0));
					}
				}
			
				while(!Q.isEmpty()){
					Flower f = Q.peek();
					Q.poll();
					for(int i=0; i<4; i++){
						int nx = f.x + dx[i];
						int ny = f.y + dy[i];
						int day = f.day + 1;
						if(nx>=0 && ny>=0 && nx<n && ny<n && garden[nx][ny]==0){
							garden[nx][ny] = 1;
							answer = day;
							Q.offer(new Flower(nx, ny, day));
						}
					}
				}
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int n1 = 3;
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.solution(n1, garden1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int n2 = 2;
        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(n2, garden2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
        
    }    
}
