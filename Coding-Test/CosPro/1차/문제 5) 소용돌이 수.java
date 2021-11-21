// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
class Main {
		int[] dx = {0,1,0,-1};
    int[] dy = {1,0,-1,0};
    public int solution(int n) {
			int answer = 0;
			int turn = (n%2) == 0? n/2 : (n/2)+1;
			int cx, cy;
			int cur = 1;
			int[][] arr = new int[n][n];
			for(int i=0; i<turn; i++){
				int d = 0;
				cx = i;
				cy = i;
				arr[cx][cy] = cur ++;
				while(d<4){
					int nx = cx + dx[d];
					int ny = cy + dy[d];
					if(nx >=n || nx<0 || ny>=n || ny<0 || arr[nx][ny]>0){
						d++;
						continue;
					}
					arr[nx][ny] = cur++;
					cx = nx;
					cy = ny;
				}
			}
			answer = getResult(arr);
			return answer;
    }
		public int getResult(int[][] arr){
			int sum = 0;
			for(int i=0; i<arr.length; i++){
				sum += arr[i][i];
			}
			return sum;
		}
  // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int n1 = 3;
        int ret1 = sol.solution(n1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int ret2 = sol.solution(n2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
