// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public String solution(String phrases, int second) {
        String answer = "";
				String temp = "______________";
				temp = temp.concat(phrases);
				for(int i=0; i< second; i++){
					char tmp = temp.charAt(0);
					temp += tmp;
					temp = temp.substring(1);
				}
				answer = temp.substring(0,phrases.length());
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String phrases = new String("happy-birthday");
        int second = 3;
        String ret = sol.solution(phrases, second);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
    }
}
