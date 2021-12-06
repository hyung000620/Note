import java.util.*;
  
public class Main {
  public String solution(String str){
  	String answer = "YES";
	Stack<Character> stack = new Stack<>();
    for(char c : str.toCharArray()){
    	if(c == '(') stack.push(c);
      	else{
        	if(stack.isEmpty()) return "NO";
          	stack.pop();
        }
    }
    if(!stack.isEmpty()) return "NO";
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(T.solution(str));
  }
}
/**
Stack 특징
- LIFO(Last In First Out)
- 시스템 해킹에서 버퍼오버플로우 취약점을 이용한 공격을 할 때 스택 메모리의 영역에서 함
- 인터럽트 처리, 수식의 계산, 서브 루틴의 복귀 번지 저장등에 쓰임.
- 그래프의 깊이 우선 탐색(DFS)에서 사용.
- 재귀적 함수를 호출 할 때 사용.

Stack 메소드
- push(A) : A라는 값을 Stack에 추가한다. 
- pop() : Stack의 상단에 있는 값을 꺼낸다.
- isEmpty() : Stack이 비어있는지 확인한다. 리턴타입은 boolean 이다.
- clear() : Stack의 전체 값 제거(초기화)
- peek() : stack의 가장 상단의 값 출력
- size() : stack의 크기 출력.
- contains(1) : stack에 1이 있는지 check 있다면 true. 리턴 타입은 boolean이다. 
**/
