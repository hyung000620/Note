// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(int a, int b) {
				int answer = 0;
				for(int i=1; i<a; i++){
					if(isPrime(i)){
						if(Math.pow(i,3)>=a && Math.pow(i,3)<=b){
							answer ++;
						}
						if(Math.pow(i,2) >=a && Math.pow(i,2)<=b){
							answer ++;
						}
					}
				}
        return answer;
    }
		public boolean isPrime(int num){
			if(num == 1) return false;
			for(int i=2; i<num; i++){
				if(num%i == 0) return false;
			}
			return true;
		}

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(int a, int b) {
				int answer = 0;
				for(int i=1; i<a; i++){
					if(isPrime(i)){
						if(Math.pow(i,3)>=a && Math.pow(i,3)<=b){
							answer ++;
						}
						if(Math.pow(i,2) >=a && Math.pow(i,2)<=b){
							answer ++;
						}
					}
				}
        return answer;
    }
		public boolean isPrime(int num){
			if(num == 1) return false;
			for(int i=2; i<num; i++){
				if(num%i == 0) return false;
			}
			return true;
		}

