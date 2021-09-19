class Solution {
    public String solution(String s, int n) {
		String answer = "";
		
		for(int i=0; i<s.length(); i++) {
			char alpa = s.charAt(i);
			
			if(alpa >= 'a' && alpa <= 'z') {
				if(alpa + n > 'z') answer += (char)(alpa + n-26);
				else answer += (char)(alpa + n);
			}
			else if(alpa >= 'A' && alpa <= 'Z') {
				if(alpa + n > 'Z') answer += (char)(alpa + n-26);
				else answer += (char)(alpa + n);
			}
			else answer += (char)alpa;

		}
		
		return answer;
    }
}
