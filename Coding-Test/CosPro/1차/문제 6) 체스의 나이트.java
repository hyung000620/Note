// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
class Main {
    public int solution(String pos) {
        int x = pos.charAt(0)-65;
	int y = (pos.charAt(1)-'0')-1;
        int answer = 0;
	if(y -2 >= 0 && x -1 >= 0) answer++;
        if(x -2 >= 0 && y -1 >= 0) answer++;
        if(x +1 <= 7 && y -2 >= 0) answer++;
        if(x +2 <= 7 && y -2 >= 0) answer++;
        if(x -2 >= 0 && y -1 >= 0) answer++;
        if(x -1 >= 0 && y +1 <= 7) answer++;
        if(x +2 <= 7 && y +1 <= 7) answer++;
        return answer;
    }
      // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String pos = "A7";
        int ret = sol.solution(pos);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
