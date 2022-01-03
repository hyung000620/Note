import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @정규표현식 에서 제공하는 기능 중 사용한 기능은 다음과 같다.
 *
 * @논-캡쳐링 을 의미하는 (?:)    <--- ?와 : 사이에 특정 메타 문자를 추가할 수 있다.
 * @캡쳐링 을 의미하는 ()    <--- 캡쳐링을 통해 바꿔줘야할 문자를 쉽게 표현할 수 있게 된다. 첫 번째 캡쳐링이면 $1 와 같이 사용한다.
 * @집합 을 의미하는 []
 * @바로앞패턴 의 갯수를 의미하는 {}    <--- 예를 들어, a{1} 이면 'a' 라는 문자가 1번 나온다는 의미이다.
 * 
 * 
 */


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();

        str = str.replaceAll("(?:([a|e|i|o|u]{1})(p{1})([a|e|i|o|u]{1}))", "$1");
        
        bw.write(str);
        bw.flush();
        bw.close();
    }
    
}
